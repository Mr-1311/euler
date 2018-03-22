
/*

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.


 */
package q021;

public class Q021 {
	protected int sumOfDivisors(int num) {
		int sum = 1;
		for (int i = 2; i < (num/2)+1; i++) {
			if (num % i == 0){
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Q021 q = new Q021();
		int a, sum = 0;
		
		for (int i = 2; i <= 10000; i++) {
			a = q.sumOfDivisors(i);
			if (q.sumOfDivisors(a) == i && a != i){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
