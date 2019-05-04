
import java.util.*;


public class User {
    private int idUser;
    private String nombre;
    private String password;
    private Sala salaActual;
    private static int id = 0;
    
    public User(String nombre, String password) {
    	this.idUser = id++;
    	this.nombre = nombre;
    	this.password = password;
    	this.salaActual = null;
    }


    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return
     */
    public boolean unirseSala(Sala sa) {
    	if(this.salaActual == null){
    		sa.entradaJugador(this);
    		return true;
    	}
    	return false;
    }


    public Sala crearSala() {
    	Sala sa = new Sala(this);
    	salaActual = sa;
    	return sa;
    }


    public void abandonarSala() {
    	if(salaActual != null){
    		salaActual.salidaJugador(this);
    		salaActual = null;
    	}
    }
    
    public Partida iniciarPartida(int puntajeObjetivo){
    	Partida part = null;
    	if(salaActual != null && salaActual.esCreador(this)){
    		part = salaActual.iniciarPartida(puntajeObjetivo);
    	}
    	return part;
    }

    public void estarListo(){
    	if(salaActual != null){
    		salaActual.jugadorListo(this);
    	}
    }
    
    public void estarEnEspera(){
    	if(salaActual != null){
    		salaActual.jugadorEnEspera(this);
    	}
    }
    
    
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUser;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idUser != other.idUser)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}