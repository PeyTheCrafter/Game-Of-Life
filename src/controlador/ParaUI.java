package controlador;

import vista.UI;

public class ParaUI extends UI {
	protected GameOfLife control = new GameOfLife(10);

	public ParaUI() {
		super();
		actualizarVentana();
		for (int i = 0; i < control.lado; i++) {
			for (int j = 0; j < control.lado; j++) {
				tablero.botones[i][j].addActionListener(new MyActionListenerTablero(this, control));
			}
		}
	}

	private void actualizarVentana() {
		for (int i = 0; i < control.lado; i++) {
			for (int j = 0; j < control.lado; j++) {

			}
		}
	}

	public void cambiarCasilla(int x, int y) {
		if (control.tablero[x][y].isAlive()) {
			control.tablero[x][y].setAlive(false);
		} else {
			control.tablero[x][y].setAlive(true);
		}
	}
}
