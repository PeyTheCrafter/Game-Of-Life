package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;

public class UI extends JFrame {
	protected JPanel panelBotonera;
	protected Tablero tablero;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JPanel panelControl = new JPanel();
		GridBagConstraints gbc_panelControl = new GridBagConstraints();
		gbc_panelControl.insets = new Insets(0, 0, 5, 0);
		gbc_panelControl.fill = GridBagConstraints.BOTH;
		gbc_panelControl.gridx = 0;
		gbc_panelControl.gridy = 0;
		getContentPane().add(panelControl, gbc_panelControl);
		panelControl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnPlay = new JButton("Play");
		panelControl.add(btnPlay);

		JButton btnStop = new JButton("Stop");
		panelControl.add(btnStop);
		
		panelBotonera = new Tablero();
		GridBagConstraints gbc_panelBotonera = new GridBagConstraints();
		gbc_panelBotonera.fill = GridBagConstraints.BOTH;
		gbc_panelBotonera.gridx = 0;
		gbc_panelBotonera.gridy = 1;
		getContentPane().add(panelBotonera, gbc_panelBotonera);
	}
	
	
}
