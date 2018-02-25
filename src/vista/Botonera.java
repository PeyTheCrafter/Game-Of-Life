package vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Botonera extends JPanel {
	public JButton botones[][];
	protected int lado;

	/**
	 * Create the panel.
	 */
	public Botonera(int lado) {
		this.lado = lado;
		crearBotones();
	}

	public void crearBotones() {
		this.botones = new JButton[this.lado][this.lado];
		for (int i = 0; i < this.lado; i++) {
			for (int j = 0; j < this.lado; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(i + "-" + j);
				this.add(this.botones[i][j]);
			}
		}
	}
}
