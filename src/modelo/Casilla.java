package modelo;

public class Casilla {
	int posX;
	int posY;
	boolean viva = false;
	int vecinos = 0;

	public Casilla(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isAlive() {
		return viva;
	}

	public void setAlive(boolean alive) {
		this.viva = alive;
	}

	public int getNeighbours() {
		return vecinos;
	}

	public void setNeighbours(int neighbours) {
		this.vecinos = neighbours;
	}
}
