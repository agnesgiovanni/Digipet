
public class Digipet {
	private String name;
	private int happiness;
	private int health;
	private int cleanness;
	public Digipet(String name, int happiness, int health, int cleanness) {
		super();
		this.name = name;
		this.happiness = happiness;
		this.health = health;
		this.cleanness = cleanness;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHappiness() {
		return happiness;
	}
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getCleanness() {
		return cleanness;
	}
	public void setCleanness(int cleanness) {
		this.cleanness = cleanness;
	}
	
	Digipet() {
		this.happiness = 10;
		this.health = 10;
		this.cleanness = 10;
	}
	
	public void voice() {
		System.out.println("Your Digipet sound:\n");
		
	}
	
}
