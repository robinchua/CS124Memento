
public class Tester {
	public static void main(String[] args) {
		Caretaker c = new Caretaker();
		Originator Robin = new Originator();
		
		//save the initial state using a memento
		c.save(Robin.makeSnapshot());
		//do some activities
		Robin.party();
		Robin.party();
		Robin.rest();
		Robin.workOvertime();
		Robin.workOvertime();
		//save the current state using a memento
		c.save(Robin.makeSnapshot());
		
		//check the current state status
		System.out.println("Health: "+Robin.getHealth());
		System.out.println("Wealth: "+Robin.getWealth());
		System.out.println("Social Life: "+Robin.getSocialLife());
		
		//restore to the initial state
		Robin.restore(c.get(0));
		//check the current state again
		System.out.println("Health: "+Robin.getHealth());
		System.out.println("Wealth: "+Robin.getWealth());
		System.out.println("Social Life: "+Robin.getSocialLife());
	}
}
