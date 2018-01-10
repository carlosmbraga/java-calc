
public class Calculator {

	private double num1;
	private double num2;
	private Operation operation;

	public Calculator() {

	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public double calculate() {
		return this.operation.execute(this.num1, this.num2);
	}


}
