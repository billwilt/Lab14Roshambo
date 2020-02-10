
public abstract class Player {
	
	protected String name;
	
	
	
	public Player() {
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();
}
