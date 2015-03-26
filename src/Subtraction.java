public class Subtraction extends Operator {
	public int result() {
		if (this.a == null || this.b == null) return 0;
		return this.getOperands()[0].getValue() - this.getOperands()[1].getValue();
	}
}
	