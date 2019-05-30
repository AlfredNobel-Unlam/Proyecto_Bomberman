
public class ObstaculoDestruible extends ObjetoEnMapa {
	private boolean destructible = true;

	public ObstaculoDestruible(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[" + (destructible?"D":"I") + "]";
	}
	public void destruirse() {
		posX=posY=-1;
		// TODO Auto-generated constructor stub
	}
}
