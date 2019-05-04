import java.util.List;

public class Bomberman extends ObjetoEnMapa{

	private User jugador;
	private int limiteCantBomba;
	private int cantActBombas;
	private Mapa map;
	private boolean vivo;
	private Partida part;

	public Mapa getMapa(){
		return map;
	}
	
	public Bomberman(User usr, int posX, int posY, Mapa map) {
		super(posX, posY);
		this.jugador = usr;
		this.limiteCantBomba = 1;
		this.cantActBombas = 0;
		this.map = map;
		this.vivo = true;
	}


	public boolean comprobarCasillaValida() {
		return true;
	}

	public boolean moverArriba() {
		if( map.moverArriba(this) ){
			this.posY -=1;
			return true;
		}
		return false;
	}

	public boolean moverAbajo() {
		if( map.moverAbajo(this) ){
			this.posY +=1;
			return true;
		}
		return false;
	}

	public boolean moverDerecha() {
		if( map.moverDerecha(this) ){
			this.posX +=1;
			return true;
		}
		return false;
	}

	public boolean moverIzquierda() {
		if( map.moverIzquierda(this) ){
			this.posX -=1;
			return true;
		}
		return false;
	}

	public boolean plantarBomba() {
      Bomba b= new Bomba(this);
      b.activar();
		return true;
	}

	public void morir() {
		this.vivo = false;
		map.sacarBomberman(this);
	}
	
	public void sumarPunto(){
		this.part.sumarPuntoAJugador(this.jugador);
	}
}
