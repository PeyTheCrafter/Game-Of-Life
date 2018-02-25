package controlador;

import modelo.Casilla;

public class GameOfLife {
	protected Casilla tablero[][];
	protected int lado;

	public GameOfLife(int lado) {
		super();
		this.lado = lado;
		crearTablero();
	}

	private void crearTablero() {
		this.tablero = new Casilla[this.lado][this.lado];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = new Casilla(i, j);
			}
		}
	}

	/**
	 * Realiza todas las comprobaciones para cada casilla
	 * 
	 * @param tablero
	 */
	public static void realizarComprobaciones(int[][][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				calcularVecinos(tablero, i, j);
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				comprobarCondiciones(tablero, i, j);
			}
		}
	}

	public static void calcularVecinos(int[][][] tablero, int i, int j) {
		int vecinos;
		if (tablero[i][j][0] == 0) {
			vecinos = 0;
		} else {
			vecinos = -1;
		}
		for (int k = -1; k <= 1; k++) {
			for (int l = -1; l <= 1; l++) {
				if ((i + k) >= 0 && (i + k) < tablero.length) {
					if ((j + l) >= 0 && (j + l) < tablero.length) {
						if (tablero[i + k][j + l][0] == 1) {
							vecinos++;
						}
					}
				}
			}
		}
		tablero[i][j][1] = vecinos;
	}

	public static void comprobarCondiciones(int[][][] tablero, int i, int j) {
		if (tablero[i][j][1] == 0) {
			tablero[i][j][0] = 0;
		}
		if (tablero[i][j][1] == 1) {
			tablero[i][j][0] = 0;
		}
		if (tablero[i][j][1] >= 4) {
			tablero[i][j][0] = 0;
		}
		if (tablero[i][j][1] == 3) {
			tablero[i][j][0] = 1;
		}
	}

	public static void intercambiarTableros(int[][] tablero, int[][] tableroDos) {
		int intercambio;
		for (int i = 0; i < tableroDos.length; i++) {
			for (int j = 0; j < tableroDos.length; j++) {
				intercambio = tableroDos[i][j];
				tableroDos[i][j] = tablero[i][j];
				tablero[i][j] = intercambio;
			}
		}
	}
}
