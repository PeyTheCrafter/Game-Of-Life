package controlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import modelo.Casilla;

class GameOfLifeTest {

	@Ignore
	void testRealizarComprobaciones() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularVecinos() {
		GameOfLife instancia = new GameOfLife(3);
		int[][] respuesta = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		instancia.tablero[0][0].setAlive(true);
		instancia.calcularVecinos(1, 1);
		assertEquals(1, instancia.tablero[1][1].getNeighbours());
	}

	@Ignore
	void testComprobarCondiciones() {
		fail("Not yet implemented");
	}

	@Ignore
	void testIgualarTableros() {
		fail("Not yet implemented");
	}
}
