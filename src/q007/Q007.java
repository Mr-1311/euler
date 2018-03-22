
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

 */
package q007;

public class Q007 {
	public static void main(String[] args){
		int num = 3, count = 0, i;
		
		while(true) {
			for(i = 2; i < num; i++){
				if(num % i == 0)
					break;
			}
			
			if(i == num){
				count++;
			}

			if(count == 10000){
				System.out.println(num);
				break;
			}
			num += 2;
		}
	}
}
