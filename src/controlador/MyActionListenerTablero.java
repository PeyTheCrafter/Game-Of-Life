package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListenerTablero implements ActionListener {
	ParaUI paraUI;
	GameOfLife control;

	public MyActionListenerTablero(ParaUI paraUI, GameOfLife control) {
		super();
		this.paraUI = paraUI;
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		String name = boton.getName();
		int[] coordenadas = interpretarCoordenadas(name);
		paraUI.cambiarCasilla(coordenadas[0], coordenadas[1]);
	}

	private int[] interpretarCoordenadas(String coord) {
		int[] coordenadas = new int[2];
		int espacio = coord.indexOf(' ');
		coordenadas[0] = Integer.valueOf(coord.substring(0, espacio));
		coordenadas[1] = Integer.valueOf(coord.substring(espacio, coord.length()));
		System.out.println(coordenadas[0]);
		System.out.println(coordenadas[1]);
		return coordenadas;
	}

}
