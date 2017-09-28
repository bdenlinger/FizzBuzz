/*
 * Simply outputs numbers 1 through 100. If divisible by 3
 * it prints "Fizz" and if divisible by 5 it prints "Buzz.
 * If divisible by both it prints both.
 */
package fizzBuzz;

public class Main {

	public static void main(String[] args) {
		String f = "Fizz";
		String b = "Buzz";
		
		for(int i = 1; i<101; i++) {
			System.out.print(i + ": ");
			if(i%3 == 0) {
				System.out.print(f);
			}
			if(i%5 == 0) {
				System.out.print(b);
			}
			System.out.print("\n");
		}
	}
}
