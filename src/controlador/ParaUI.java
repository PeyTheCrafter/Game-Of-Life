package controlador;

import vista.UI;

public class ParaUI extends UI {
	GameOfLife game = new GameOfLife(this.lado);
	MyActionListenerTablero listenerTablero = new MyActionListenerTablero(this);
	MyActionListenerIterate listenerIterate = new MyActionListenerIterate(this, game);

	public ParaUI() {
		super();
		this.lado = 10;
		actualizarTablero();
		this.btnIterate.addActionListener(listenerIterate);
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones.length; j++) {
				this.botonera.botones[i][j].addActionListener(listenerTablero);
			}
		}
	}

	public void actualizarTablero() {
		for (int i = 0; i < this.game.tablero.length; i++) {
			for (int j = 0; j < this.game.tablero.length; j++) {
				if (this.game.tablero[i][j].isAlive()) {
					this.botonera.botones[i][j].setText("o");
				} else {
					this.botonera.botones[i][j].setText("·");
				}
			}
		}
		mostrarTablero();
	}

	public void cambiarCasilla(int x, int y) {
		if (this.game.tablero[x][y].isAlive()) {
			this.game.tablero[x][y].setAlive(false);
		} else {
			this.game.tablero[x][y].setAlive(true);
		}
		actualizarTablero();
	}

	public void mostrarTablero() {
		for (int i = 0; i < this.game.tablero.length; i++) {
			for (int j = 0; j < this.game.tablero.length; j++) {
				System.out.print(this.game.tablero[i][j].getNeighbours());
			}
			System.out.println();
		}
		System.out.println();
	}
}
