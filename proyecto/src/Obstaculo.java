
import java.util.*;

public class Obstaculo extends ObjetoEnMapa{
    private boolean destructible;
    
    public Obstaculo(int posX, int posY, boolean destructible) {
    	super(posX, posY);
    	this.destructible = destructible;
    }
    
    @Override
	public String toString() {
		return "[" + (destructible?"D":"I") + "]";
	}


}