
public class OperationFactory {

	public Operation create(Operator operatorType) {

		if ( operatorType == null) {
			return null;
		}

		switch (operatorType) {

		case ADD: return new Addition();
		case SUBTRACT: return new Subtraction();
		case MULTIPLY: return new Multiplication();
		case DIVIDE: return new Division();
		default: break;

		}

		return null;
	}
}




