package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Tablero extends JPanel {
	protected int lado = 10;
	public JButton[][] botones;

	/**
	 * Create the panel.
	 */
	public Tablero() {
		// this.lado = lado;
		setLayout(new GridLayout(this.lado, this.lado, 0, 0));
		crearBotones();
	}

	private void crearBotones() {
		botones = new JButton[this.lado][this.lado];
		for (int i = 0; i < this.lado; i++) {
			for (int j = 0; j < this.lado; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(i + " " + j);
				this.botones[i][j].setText(i + " " + j);
				this.add(botones[i][j]);
			}
		}
	}

}
