
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

 */
package q010;

import java.util.ArrayList;

public class Q010 {
	public static void main(String[] args) {
		long sum = 2;
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		for (int i = 3; i < 2000000; i += 2) {
			for (int j =0 ; j < primes.size(); j++) {
				if(i % primes.get(j) == 0)
					break;
				if(j == primes.size() - 1){
					primes.add(i);
					sum += i;
				}
			}
		}
		System.out.println("there are "+primes.size()+ "prime under two million and sum of them is "+sum);

	}
}
