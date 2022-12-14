import java.util.Scanner;

public class Postfix {

	private ArrayStack<String> expStack;
	private PostfixEvaluator evaluator;
	
	public Postfix () {
		expStack = new ArrayStack<String>();
		evaluator = new PostfixEvaluator();
	}

	public void run () {
		String expression, action = "e";
		int result;

		try {
			Scanner in = new Scanner(System.in);
      
			do {
				if (action.equals("e")) {
					System.out.print("Enter a valid postfix expression:  ");
					expression = in.nextLine();
	
					result = evaluator.evaluate(expression.trim());
					System.out.println("The result is " + result);
	
					expression = expression + " = "+ result;
					
					// add expression to the stack
					expStack.push(expression);

				
				} else if (action.equals("r")) {

					// display the recent expressions
					if (expStack.size() >= 3) {
						showRecent(3);
					}
					else {
						showRecent(expStack.size());
					}


				}

				System.out.println("\nWhat do you want to do?");
				System.out.println("\tType 'e' if you want to evaluate another postfix expression.");
				System.out.println("\tType 'r' if you want to see the recent expressions.");
				System.out.println("\tType any other key to quit.");
				action = in.nextLine();
				System.out.println();
			} while (action.equalsIgnoreCase("e") || action.equalsIgnoreCase("r"));
    	} catch (Exception IOException) {
    		System.out.println("Invalid postfix expression");
    	}

	}
	
	private void showRecent (int numToShow) {

		ArrayStack<String> tmp = new ArrayStack<String>();

		System.out.println("Recent Expressions:");
		
		// Add your code here to show the recent expressions and to restore expStack
		for (int i = 0; i < numToShow; i++) {
			String value = expStack.pop();
			tmp.push(value);
		}
		
		for (int i = 0; i < numToShow; i++) {
			System.out.println(tmp.peek());
			expStack.push(tmp.pop());
		}
		

	}
	
	
	public static void main (String[] args) {
		Postfix pf = new Postfix();
		pf.run();
	}
}
