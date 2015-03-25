package observer_example;

public class ObserverExample {
	
	public static void main(String[] args) {
		ObservableValue a = new ObservableValue(3);
		ObservableValue b = new ObservableValue(5);
		
		SumObserver sum = new SumObserver(a, b);
		DiffObserver diff = new DiffObserver(a, b);
		
		System.out.println("\nClient: Changing value a from 3 to 7.");
		a.setValue(7);
		
		System.out.println("\nClient: Changing value b from 5 to 9.");
		b.setValue(9);
	}

}
