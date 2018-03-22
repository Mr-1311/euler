
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
package q009;

public class Q009 {
	
	public static int findRoot(int a){
		int result = 0;
		for (int i = 1; i < Math.sqrt(a)+3; i++) {
			if(i * i == a){
				result = i;
				break;
			}
		}
			return result;		
	}
	
	public static void main(String[] args) {
		int a, b, c, result = 0, t = 1000;
		boolean finish = false;
		
		for (a = 1; a < (t / 3) + 1; a++) {
			for (b = a+1; b < (t - a) / 2; b++) {
				
				c = findRoot((a*a)+(b*b));
				if(a + b + c == t){
					result = a * b * c;
					System.out.println("a < b < c "+ a +" "+ b +" "+ c +" result "+ result);
					finish = true;
					break;
				}
			}
			if(finish)
				break;
		}
	}
}
