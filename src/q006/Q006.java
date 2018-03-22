
/*

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
package q006;

public class Q006 {
	
	public static void main(String[] args){
		int sumOfSquares = 0, squaresOfSum = 0, difference;
		
		for(int i = 1; i <= 100; i++){
			
			sumOfSquares += i*i;
			
			squaresOfSum += i;
		}
		squaresOfSum = squaresOfSum * squaresOfSum;
		
		difference = squaresOfSum - sumOfSquares;
		
		System.out.println(difference);
	}

}
