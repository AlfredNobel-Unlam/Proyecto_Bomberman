
import java.util.*;

public class Mapa {

	private int ancho;
	private int alto;
	private ObjetoEnMapa posiciones[][];
	private ArrayList<Bomberman> bombermans;
	private ArrayList<ObjetoEnMapa> objetos;
	private Partida part;

	public Mapa(int ancho, int alto, int porcentLugaresLibres, Set<User> jugadores) {
		this.setAncho(ancho);
		this.alto = alto;
		posiciones = new ObjetoEnMapa[alto][ancho];
		int cantObstaculos = (ancho * alto) * (1 - porcentLugaresLibres / 100);
		int aux, m, n;
		Random ran = new Random();
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				posiciones[i][j] = new ObjetoEnMapa(i, j);
			}
		}
		for (int i = 0; i < cantObstaculos; i++) {
			aux = (ran.nextInt() % (ancho * alto));
			m = aux / ancho;
			n = aux % ancho;
			posiciones[m][n] = new Obstaculo(m, n, false);
		}
		
		posiciones[0][0]=null;
		for (User jugador : jugadores) {
			Bomberman bomb = new Bomberman(jugador, 0, 0, this);
			bombermans.add(bomb);
		}
	}

	public Mapa(int ancho, int alto, int porcentLugaresLibres) {
		this.setAncho(ancho);
		this.alto = alto;
		posiciones = new ObjetoEnMapa[alto][ancho];
		this.objetos=new  ArrayList<ObjetoEnMapa>();
		int cantObstaculos = (ancho * alto) * (1 - porcentLugaresLibres / 100);
		int aux, m, n;
		Random ran = new Random();
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				posiciones[i][j] = new ObjetoEnMapa(i, j);
			}
		}
		for (int i = 0; i < cantObstaculos; i++) {
//			aux = (ran.nextInt() % (ancho * alto));
			aux = Math.max(0, (ran.nextInt() % (ancho * alto)));
			m = aux / ancho;
			n = aux % ancho;
			
			if(m!=0 && n !=0 ){
			posiciones[m][n] = new Obstaculo(m, n, true);
			this.objetos.add(posiciones[m][n]);
			}
		}
		posiciones[0][0]=null;
		// for(User jugador : jugadores){
		// Bomberman bomb = new Bomberman(jugador, 0, 0, this);
		// bombermans.add(bomb);}
	}

	public boolean moverArriba(Bomberman bomb) {
		Obstaculo obs = null;
		if (bomb.posY != 0 && this.posiciones[bomb.posY - 1][bomb.posX].getClass() != obs.getClass()) {
			this.posiciones[bomb.posY - 1][bomb.posX] = bomb;
			this.posiciones[bomb.posY][bomb.posX] = new ObjetoEnMapa(bomb.posX, bomb.posY);
			return true;
		}
		return false;
	}

	public boolean moverAbajo(Bomberman bomb) {
		Obstaculo obs = null;
//		if (bomb.posY != this.alto && this.posiciones[bomb.posY + 1][bomb.posX + 1].getClass() != obs.getClass()) {		
			if (bomb.posY != (this.alto -1)&& this.posiciones[bomb.posY + 1][bomb.posX + 1] != null) {
//				this.posiciones[bomb.posY + 1][bomb.posX] = bomb;
//			this.posiciones[bomb.posY][bomb.posX] = new ObjetoEnMapa(bomb.posX, bomb.posY);
			return true;
		}
		return false;
	}

	public boolean moverDerecha(Bomberman bomb) {
		Obstaculo obs = null;
		if (bomb.posX != this.getAncho() && this.posiciones[bomb.posY][bomb.posX + 1].getClass() != obs.getClass()) {
			this.posiciones[bomb.posY][bomb.posX + 1] = bomb;
			this.posiciones[bomb.posY][bomb.posX] = new ObjetoEnMapa(bomb.posX, bomb.posY);
			return true;
		}
		return false;
	}

	public boolean moverIzquierda(Bomberman bomb) {
		Obstaculo obs = null;
		if (bomb.posX != 0 && this.posiciones[bomb.posY][bomb.posX - 1].getClass() != obs.getClass()) {
			this.posiciones[bomb.posY][bomb.posX - 1] = bomb;
			this.posiciones[bomb.posY][bomb.posX] = new ObjetoEnMapa(bomb.posX, bomb.posY);
			return true;
		}
		return false;
	}

	public void sacarBomberman(Bomberman bom) {
		this.bombermans.remove(bom);
		if (this.bombermans.size() == 1) {
			this.bombermans.get(0).sumarPunto();
			// Finalizar
		}
	}

	public void explosion(Bomba bomb) {
		this.posiciones[bomb.posY][bomb.posX] = new ObjetoEnMapa(bomb.posX, bomb.posY);
	}

	public ObjetoEnMapa[][] getobjetos() {
		// TODO Auto-generated method stub
		return posiciones;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
}
