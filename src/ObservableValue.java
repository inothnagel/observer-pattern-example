
import java.util.ArrayList;

public class ObservableValue implements Observable {
	private ArrayList<Observer> observers = new ArrayList<>();
	private int value = 0;
	
	public ObservableValue(int i) {
		value = i;
		print("I have been created with a value of " + i + ".");
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		print("An observer has registered with me to receive notifications when I change.");
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}	
	
	public void setValue(int i) {
		print("My value has changed from " + value + " to " + i + ". I will notify my observers.");
		value = i;
		notifyObservers();
	}
	
	public int value() {
		return value;
	}
	
	public void print(String msg) {
		System.out.println("ObservableValue (" + value + "): " + msg);
	}
}
