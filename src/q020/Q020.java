
/*

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!


 */
package q020;

public class Q020 {
	protected String sum(String a, String b) {
		String re = "";
		int carry = 0;
		
		for (int i = 0; i < a.length(); i++) {
			
			if (b.length()-(i+1) >= 0){
				re = (((Character.getNumericValue(a.charAt(a.length()-(i+1))) + Character.getNumericValue(b.charAt(b.length()-(i+1))))+carry) % 10) + re;
				carry = ((Character.getNumericValue(a.charAt(a.length()-(i+1))) + Character.getNumericValue(b.charAt(b.length()-(i+1))))+ carry) / 10;
			}
			else{
				re = ((Character.getNumericValue(a.charAt(a.length()-(i+1))) + carry) % 10) + re;
				carry = ((Character.getNumericValue(a.charAt(a.length()-(i+1))) + carry) / 10);
			}
		}
		if(carry != 0){
			re = carry + re;
		}
		
		return re;
	}
	
	public static void main(String[] args) {
		Q020 q = new Q020();
		String faktor = "100", willAdd = "100";
		int summ = 0;
		
		for (int i = 99; i > 1; i--) {
			for (int j = i; j > 1; j--) {
				faktor = q.sum(faktor, willAdd);
			}
			willAdd = faktor;
			
		}
		for (int i = 0; i < faktor.length(); i++) {
			summ += Character.getNumericValue(faktor.charAt(i));
		}
		System.out.println(summ);
	}
}
