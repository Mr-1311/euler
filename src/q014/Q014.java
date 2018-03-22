/*

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.


 */

package q014;

public class Q014 {
	private long ifEven(long num){
		return num / 2;
	}
	
	private long ifOdd(long num){
		return (num * 3) + 1;
	}
	
	public static void main(String[] args) {
		Q014 q = new Q014();
		long num, len, bl = 0, st = 0;
		for (int i = 2; i < 1000000; i++) {
			num = i;
			len = 1;
			while(true){
				if(num % 2 != 0){
					num = q.ifOdd(num);
					len++;
				}
				else{
					num = q.ifEven(num);
					len++;
					if(num == 1){
						if(len > bl){
							bl = len;
							st = i;
							System.out.println(bl +"  -  "+ st);
						}
						break;
					}
				}
			}
		}
		System.out.println(st);
		
	}
}
