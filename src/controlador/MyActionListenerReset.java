package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerReset implements ActionListener {
	ParaUI paraUI;
	GameOfLife game;

	public MyActionListenerReset(ParaUI paraUI, GameOfLife game) {
		this.paraUI = paraUI;
		this.game = game;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		game.reiniciarTablero();
		paraUI.actualizarTablero();
	}

}
