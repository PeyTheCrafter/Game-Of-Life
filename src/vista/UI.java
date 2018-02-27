package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;

public class UI extends JFrame {
	private JPanel contentPane;
	protected Botonera botonera;
	protected JPanel panelControl;
	protected JButton btnPlay;
	protected JButton btnPause;
	protected JButton btnIterate;
	protected int lado = 25;

	/**
	 * Create the frame.
	 */
	public UI() {
		// Estilo visual de windows.
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		panelControl = new JPanel();
		panelControl.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_panelControl = new GridBagConstraints();
		gbc_panelControl.insets = new Insets(0, 0, 5, 0);
		gbc_panelControl.fill = GridBagConstraints.BOTH;
		gbc_panelControl.gridx = 0;
		gbc_panelControl.gridy = 0;
		contentPane.add(panelControl, gbc_panelControl);

		btnPlay = new JButton("Play");
		panelControl.add(btnPlay);

		btnPause = new JButton("Pause");
		panelControl.add(btnPause);

		btnIterate = new JButton("Iterate");
		panelControl.add(btnIterate);

		botonera = new Botonera(this.lado);
		botonera.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_botonera = new GridBagConstraints();
		gbc_botonera.fill = GridBagConstraints.BOTH;
		gbc_botonera.gridx = 0;
		gbc_botonera.gridy = 1;
		contentPane.add(botonera, gbc_botonera);
		botonera.setLayout(new GridLayout(this.lado, this.lado, 0, 0));
	}

}
