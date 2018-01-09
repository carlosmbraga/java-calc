
public class CalculatorFactory {

	public Strategy getOperator (Operator operatorType ) {

		if ( operatorType == null) {
			return null;
		}

		if(operatorType.equals(Operator.ADD)){
			return new Addition();

		} else if(operatorType.equals(Operator.SUBTRACT)){
			return new Subtraction();

		} else if(operatorType.equals(Operator.MULTIPLY)){
			return new Multiplication();

		} else if(operatorType.equals(Operator.DIVIDE)){
			return new Division();
		}

		return null;

	} 
}
