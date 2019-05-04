
import java.util.*;


public class Sala {
    private User creador;
    private Map<User, Boolean> jugadores;
    
    public Sala(User creador) {
    	this.creador = creador;
    	this.jugadores = new HashMap<User, Boolean>();
    }
    
    public boolean entradaJugador(User nuevoJugador){
    	//jugadores.add(nuevoJugador);
    	jugadores.put(nuevoJugador, false);
    	return true;
    }
    
    public void salidaJugador(User viejoJugador){
    	//jugadores.remove(viejoJugador);
    	jugadores.remove(viejoJugador);
    }
    
    public boolean esCreador(User posibleCreador){
    	if(creador.equals(posibleCreador)){
    		return true;
    	}
    	return false;
    }
    
    public void jugadorListo(User jugador){
    	jugadores.put(jugador, true);
    }
    
    public void jugadorEnEspera(User jugador){
    	jugadores.put(jugador, false);
    }
    
    public Partida iniciarPartida(int puntajeObjetivo){
    	Partida part = null;
    	ArrayList<User> jugadoresAJugar = new ArrayList<User>();
    	for(User jugador : jugadores.keySet()){
    		if(jugadores.get(jugador) != null && jugadores.get(jugador) == true){
    			if(jugadoresAJugar.size() <= 4){
    				jugadoresAJugar.add(jugador);//Ingresan los que estan listos. Hasta 4
    				break;
    			}
    		}
    	}
    	if(jugadores.size() >= 2){
    		part = new Partida(puntajeObjetivo, jugadoresAJugar, this);
    	}
    	return part;
    }
    
}