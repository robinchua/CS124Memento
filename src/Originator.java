
public class Originator {
	private int health=50;
	private int wealth=50;
	private int socialLife=50;
	
	public int getHealth() {
		return health;
	}
	public int getWealth() {
		return wealth;
	}
	public int getSocialLife() {
		return socialLife;
	}
	public void workOvertime() {
		System.out.println("You are working too much!");
		reduceHealth(10);
		improveWealth(20);
		reduceSocialLife(10);
	}
	public void rest() {
		System.out.println("8hrs of sleep, nice!");
		improveHealth(20);
		reduceSocialLife(10);
	}
	public void party() {
		System.out.println("PARTYYY!!!!");
		reduceHealth(10);
		reduceWealth(20);
		improveSocialLife(30);
	}
	
	public Memento makeSnapshot() {
		System.out.println("Created a snapshot of the current state.");
		Memento tmp = new Memento(health, wealth, socialLife);
		return tmp;
	}
	
	public void restore(Memento m) {
		health=m.getHealth();
		wealth=m.getWealth();
		socialLife=m.getSocialLife();
		System.out.println("State restored");
	}
	
	private void reduceHealth(int x) {
		health-=x;
		if(health==0) {
			System.out.println("You really need to rest...");
			rest();
		}
	}
	private void reduceWealth(int x) {
		wealth-=x;
		if(wealth==0) {
			System.out.println("You're broke af!");
			workOvertime();
		}
	}
	private void reduceSocialLife(int x) {
		socialLife-=x;
		if(socialLife==0) {
			System.out.println("You friends miss you!");
			party();
		}
	}
	private void improveHealth(int x) {
		health+=x;
		health=Math.min(health,100);
	}
	private void improveWealth(int x) {
		wealth+=x;
		wealth=Math.min(wealth,100);
	}
	private void improveSocialLife(int x) {
		socialLife+=x;
		socialLife=Math.min(socialLife,100);
	}
}
