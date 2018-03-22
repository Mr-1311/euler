
/*

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

*/

package q023;

import java.util.ArrayList;

public class Q023 {
	
	private boolean isAbundant(int a) {
		int t = 1;
		for (int i = 2; i < (a/2)+1; i++) {
			if(a % i == 0)
				t += i;
		}
		if (a < t) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Q023 q= new Q023();
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		ArrayList<Integer> sum2AbundantNum = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 1; i <= 28123; i++) {
			sum += i;
			if (q.isAbundant(i)) {
				abundantNums.add(i);
			}
		}
		
		for (int i = 0; i < abundantNums.size(); i++) {
			for (int j = i; j < abundantNums.size(); j++) {
				if (abundantNums.get(i) + abundantNums.get(j) <= 28123 && !sum2AbundantNum.contains(abundantNums.get(i) + abundantNums.get(j)))
					sum2AbundantNum.add(abundantNums.get(i) + abundantNums.get(j));
				
			}
		}
		
		for (Integer a : sum2AbundantNum){
			sum -= a;
		}
		
		System.out.println(sum);
	}
}
