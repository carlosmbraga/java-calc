import java.util.Scanner;

public abstract class Calculator implements Strategy {

	public static void main(String[] args) {

		int chosenOperation = 0;
		double firstValue = 0, secondValue = 0;
		String exit = "";

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


			CalculatorFactory cFactory = new CalculatorFactory();

			try{
				Context context = new Context (cFactory.getOperator(Operator.values()[chosenOperation]));
				System.out.println(context.executeStrategy(firstValue, secondValue));
			}

			catch(ArrayIndexOutOfBoundsException e){
				System.err.println("You must use a valid operator!");
			}



		} while (!exit.equalsIgnoreCase("exit"));

	}
}
