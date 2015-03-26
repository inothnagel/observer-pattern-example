
public class DiffObserver implements Observer {
	private ObservableValue a = null;
	private ObservableValue b = null;
	
	public DiffObserver(ObservableValue a, ObservableValue b) {
		this.a = a; a.addObserver(this);
		this.b = b; b.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("DiffObserver: I have been notified of a change to one of my values. My new result is " + result() + ".");
	}
	
	public int result() {
		if (a == null || b == null) return 0;
		return a.value() - b.value();
	}
}
