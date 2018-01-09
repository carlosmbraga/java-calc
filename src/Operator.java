
public enum Operator implements Strategy {


	ADD(0), SUBTRACT(1), MULTIPLY(2), DIVIDE(3);


	private int operation;


	Operator(int operation){
		this.operation = operation;
	}


	@Override
	public double doOperation(double num1, double num2) {
		return 0;
	}

}


