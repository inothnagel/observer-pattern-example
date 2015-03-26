public class Main {
	
	public static void main(String[] args) {
        System.out.println("\nClient: Creating new observable values.");
		Operand a = new Operand(3);
		Operand b = new Operand(5);
		
		Operator sum = new Addition();
		sum.setValues(a, b);
		Operator diff = new Subtraction();
		diff.setValues(a, b);
		
		System.out.println("\nClient: Changing value a from 3 to 7.");
		a.setValue(7);
		
		System.out.println("\nClient: Changing value b from 5 to 9.");
		b.setValue(9);
	}

}
