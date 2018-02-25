package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListenerTablero implements ActionListener {
	ParaUI paraUI;

	public MyActionListenerTablero(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		String name = boton.getName();
		int[] coordenadas = interpretarCoordenadas(name);
		paraUI.cambiarCasilla(coordenadas[0], coordenadas[1]);
	}

	private int[] interpretarCoordenadas(String coord) {
		String[] coor = coord.split("-");
		int[] coordenadas = new int[2];
		for (int i = 0; i < coor.length; i++) {
			coordenadas[i] = Integer.valueOf(coor[i]);
		}
		return coordenadas;
	}

}
