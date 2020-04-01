import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	List<Memento> snapshots;
	public Caretaker() {
		snapshots = new ArrayList<Memento>();
	}
	public void save(Memento m) {
		snapshots.add(m);
	}
	public Memento get(int x) {
		return snapshots.get(x);
	}
}
