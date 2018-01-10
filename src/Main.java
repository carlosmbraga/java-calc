import java.util.Scanner;

public class Main extends Calculator {

	public static void main(String[] args) {

		int chosenOperation = 0;
		double firstValue = 0, secondValue = 0;
		String exit = "";

		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);


		do {

			System.out.println("To start, choose an operation:\n");


			for ( Operator op : Operator.values()) {
				System.out.println(op.ordinal() + " - " + op );
			}

			if (sc.hasNextInt()) {
				chosenOperation = sc.nextInt();
			}else if (sc.hasNext()) {
				exit = sc.next();
				if (exit.equalsIgnoreCase("exit")) {
					System.exit(0);
				}else {
					System.out.println("Invalid Input!");
					main(null);
				}
			}else {
				System.out.println("Invalid Input!");
			}

			System.out.println("Enter the first value to be calculated:");

			if (sc.hasNextDouble()) {
				firstValue = sc.nextDouble();
			}else if (sc.hasNext()) {
				exit = sc.next();
				if (exit.equalsIgnoreCase("exit")) {
					System.exit(0);
				}else {
					System.out.println("Invalid input!");
					main(null);
				}
			}else {
				System.out.println("Invalid input!");
				main(null);
			}

			System.out.println("Enter the second value to be calculated:");

			if (sc.hasNextDouble()) {
				secondValue = sc.nextDouble();
			}else if (sc.hasNext()) {
				exit = sc.next();
				if (exit.equalsIgnoreCase("exit")) {
					System.exit(0);
				}else {
					System.out.println("Invalid Input!");
					main(null);
				}
			}else {
				System.out.println("Invalid Input!");
				main(null);
			}


			Operation operation = null;

			try{
				OperationFactory operationFactory = new OperationFactory();
				operation = operationFactory.create(Operator.values()[chosenOperation]);
			}

			catch(ArrayIndexOutOfBoundsException e){
				System.err.println("You must use a valid operator!");
			}

			calculator.setNum1(firstValue);
			calculator.setNum2(secondValue);
			calculator.setOperation(operation);
			System.out.println(calculator.calculate());


		} while (!exit.equalsIgnoreCase("exit"));

	}
}
