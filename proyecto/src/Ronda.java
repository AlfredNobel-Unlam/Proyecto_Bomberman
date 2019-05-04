
import java.util.*;


public class Ronda {
    private int tiempoLimite;
    private Mapa map;
    private Partida part;
    private Set<User> jugadores;
    
    public Ronda(int tiempoLimite, Partida part, Set<User> jugadores) {
    	this.tiempoLimite = tiempoLimite;
    	this.part = part;
    	this.jugadores = jugadores;
    }


    public void iniciar(int ancho, int alto, int porcentajeLugaresLibres, Set<User> jugadores) {
    	Mapa map = new Mapa(ancho, alto, porcentajeLugaresLibres, jugadores);
    }

    
}