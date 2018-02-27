package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class Botonera extends JPanel {
	public JButton botones[][];
	protected int lado;

	/**
	 * Create the panel.
	 */
	public Botonera(int lado) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(Color.DARK_GRAY);
		this.lado = lado;
		crearBotones();
	}

	public void crearBotones() {
		this.botones = new JButton[this.lado][this.lado];
		for (int i = 0; i < this.lado; i++) {
			for (int j = 0; j < this.lado; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(i + "-" + j);
				this.botones[i][j].setBorder(new LineBorder(Color.BLACK, 1));
				this.botones[i][j].setOpaque(false);
				this.botones[i][j].setForeground(Color.WHITE);
				this.botones[i][j].setContentAreaFilled(false);
				this.add(this.botones[i][j]);
			}
		}
	}
}
