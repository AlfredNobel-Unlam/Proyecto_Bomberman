
public class ObstaculoNoDestruible extends ObjetoEnMapa{
    private boolean destructible=false;
	
    public ObstaculoNoDestruible(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "[" + (destructible?"D":"I") + "]";
	}
}
