
public class Bunny extends Digipet {

	private int ears;

	public Bunny(String name, int happiness, int health, int cleanness, int ears) {
		super(name, happiness, health, cleanness);
		this.ears = ears;
	}

	public int getEars() {
		return ears;
	}

	public void setEars(int ears) {
		this.ears = ears;
	}

	@Override
	public void voice() {
		System.out.println("Squeak Squeak...\n");
	}
	
	
	
}
