import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class Bomba extends ObjetoEnMapa{

	private int rango;
	private int tiempoExplosion;
	private Mapa map;

	public Bomba(Bomberman bomb) {
		super(bomb.posX, bomb.posY);
		this.rango = 1;
		this.tiempoExplosion = 3;
		this.map = bomb.getMapa();
	}

	public boolean estallar() {
		map.explosion(this);
	return true;

	}

	public void esperar() {		
		Timer timer = new Timer();
		
		class Contador extends TimerTask {
		        public void run() {           
		        	Bomba.this.estallar();
		        	timer.cancel();
		        }
		    }					
		
		timer.schedule(new Contador(),1000*this.tiempoExplosion);
	
	}
	
	
public void activar() {
	this.esperar();	
	}

	public void destruir() {

	}
	

}
