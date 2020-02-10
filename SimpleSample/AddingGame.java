/*
** @author mjone
**
*/
import java.util.*;

public class AddingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // creating variable to take in input from key board.
		
			
		int number1 = (int) (Math.random() * 10);  // Creating single digit random numbers.
		int number2 = (int) (Math.random() * 10);
		
		
		
		
		System.out.println(" What is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
		(number1 + number2 == answer));
		
       if(number1 + number2 == answer) {
       	System.out.println("Correct! You're soooo SMART!!!");
       }
		
		
		
		input.close();
	}

}