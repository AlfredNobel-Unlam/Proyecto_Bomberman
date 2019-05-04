
import java.util.*;


public class Partida {

    private int puntajeObjetivo;
    private Map<User, Integer> jugadoresYPuntaje;
    private Sala salaCreadora;
    private boolean activo;

    public Partida(int puntajeObjetivo, ArrayList<User> jugadores, Sala salaCreadora) {
        this.puntajeObjetivo = puntajeObjetivo;
        for(User jugador : jugadores){
        	jugadoresYPuntaje.put(jugador, 0);
        }
        this.salaCreadora = salaCreadora;
        this.activo = false;
    }

    public Ronda iniciarRonda(int tiempoLimite){
    	Ronda ron = new Ronda(tiempoLimite, this, this.jugadoresYPuntaje.keySet());
    	
    	return ron;
    }
    
    public void sumarPuntoAJugador(User jugador){
    	if(jugadoresYPuntaje.get(jugador)+1 == this.puntajeObjetivo){
    		this.finalizar();
    	}else{
    		jugadoresYPuntaje.put(jugador, jugadoresYPuntaje.get(jugador)+1);
    	}
    }


	public void controlarPuntos() {
        // TODO implement here
    }


    public void empezar() {
        this.activo = true;
    }


    public void finalizar() {
    	this.activo = false;
    }

}