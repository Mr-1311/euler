
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
package q004;

public class Q004 {
	private boolean isPalindrome (int num){
		boolean re = true;
		for (int i = 0; i < String.valueOf(num).length() / 2; i++) {
			if(String.valueOf(num).charAt(i) != String.valueOf(num).charAt(String.valueOf(num).length()-(1+i))){
				re = false;
				return re;
			}
		}
		return re;
	}
	
	public static void main(String[] args) {
		Q004 p = new Q004();
		int s,eb = 0;
		
		for (int i = 999; i > 100; i--) {
			for (int j = i; j > 100; j--) {
				s = i*j;
				if (p.isPalindrome(s)){
					if(s > eb)
						eb = s;
				}
			}
		}
		System.out.println(eb);
	}
}

