package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerIterate implements ActionListener {
	ParaUI paraUI;
	GameOfLife game;

	public MyActionListenerIterate(ParaUI paraUI, GameOfLife game) {
		this.paraUI = paraUI;
		this.game = game;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.game.realizarComprobaciones();
		this.paraUI.actualizarTablero();
	}
}
