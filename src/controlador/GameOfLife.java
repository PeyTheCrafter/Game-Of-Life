package controlador;

import modelo.Casilla;

public class GameOfLife {
	protected Casilla tablero[][];
	protected int lado;

	public GameOfLife(int lado) {
		super();
		this.lado = lado;
		crearTablero();
		System.out.println("Tablero numérico de juego:");
	}

	/**
	 * Crea el tablero inicial.
	 */
	public void crearTablero() {
		this.tablero = new Casilla[this.lado][this.lado];
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero.length; j++) {
				this.tablero[i][j] = new Casilla(i, j);
			}
		}
	}
	
	public void cambiarCasilla(int x, int y) {
		if (this.tablero[x][y].isAlive()) {
			this.tablero[x][y].setAlive(false);
		} else {
			this.tablero[x][y].setAlive(true);
		}
	}

	/**
	 * Realiza todas las comprobaciones para cada casilla
	 * 
	 * @param tablero
	 */
	public void realizarComprobaciones() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero.length; j++) {
				calcularVecinos(i, j);
			}
		}
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero.length; j++) {
				comprobarCondiciones(i, j);
			}
		}
	}

	/**
	 * Calcula los vecinos de una casilla. Se calcula sobre tablero y se modifica en
	 * auxiliar.
	 * 
	 * @param x
	 *            posición X.
	 * @param y
	 *            posición Y.
	 */
	public void calcularVecinos(int x, int y) {
		int vecinos = 0;
		if (this.tablero[x][y].isAlive()) {
			vecinos = -1;
		}
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (i >= 0 && i < this.tablero.length && j >= 0 && j < this.tablero.length) {
					if (this.tablero[i][j].isAlive()) {
						vecinos++;
					}
				}
			}
		}
		this.tablero[x][y].setNeighbours(vecinos);
	}

	/**
	 * Comprueba las condiciones de vida de uan celda. Si tiene 0 ó 1 vecino, muere
	 * por soledad. Si tiene 4 o más vecinos, muere por sobrepobración. Si tiene 2 ó
	 * 3 vecinos, sobrevive. Si una celda muerta tiene 3 vecinos, para a estar viva.
	 * 
	 * @param x
	 *            posición X.
	 * @param y
	 *            posicion Y.
	 */
	public void comprobarCondiciones(int x, int y) {
		if (this.tablero[x][y].getNeighbours() == 0) {
			this.tablero[x][y].setAlive(false);
		}
		if (this.tablero[x][y].getNeighbours() == 1) {
			this.tablero[x][y].setAlive(false);
		}
		if (this.tablero[x][y].getNeighbours() >= 4) {
			this.tablero[x][y].setAlive(false);
		}
		if (this.tablero[x][y].getNeighbours() == 3) {
			this.tablero[x][y].setAlive(true);
		}

	}
}
