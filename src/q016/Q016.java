
/*

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?


 */
package q016;

public class Q016 {
	public static void main(String[] args) {
		String product = "1", yproduct = "";
		int carry = 0, willAdd, sum = 0;
		for (int i = 0; i < 1000; i++) {
			carry = 0;
			for (int j = 0; j < product.length(); j++) {
				willAdd = Character.getNumericValue(product.charAt(product.length()-(j+1)))*2 + carry;
				carry = willAdd / 10;
				if (j == product.length()-1){
					yproduct = willAdd + yproduct;
					product = yproduct;
					yproduct = "";
					break;
				}
				else{
					yproduct = (willAdd % 10) + yproduct; 
				}
			}
		}
		for (int i = 0; i < product.length(); i++) {
			sum += Character.getNumericValue(product.charAt(i));
		}
		System.out.println(sum);
	}
}
