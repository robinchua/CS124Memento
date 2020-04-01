
public class Memento {
	private final int health;
	private final int wealth;
	private final int socialLife;
	public Memento(int h, int w, int sl) {
		health=h;
		wealth=w;
		socialLife=sl;
	}
	public int getHealth() {
		return health;
	}
	public int getWealth() {
		return wealth;
	}
	public int getSocialLife() {
		return socialLife;
	}
}
