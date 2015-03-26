public class Addition extends Operator {
	public int result() {
		if (a == null || b == null) return 0;
		return this.getOperands()[0].getValue() + this.getOperands()[1].getValue();
	}
}
