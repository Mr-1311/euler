
/*
--easier way
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
package q003;

public class SecondWay {
	public static void main(String[] args) {
		long remainder = 600851475143L;
		int start = 3;
		while (remainder > 1){
			if(remainder % 2 == 0){
				remainder /= 2;
				System.out.println(2);
				continue;
			}
			for (int i = start; i <= remainder; i+=2) {
				if(remainder % i == 0){
					remainder /= i;
					System.out.println(i);
					start = i;
					break;
				}
			}
		}
		System.out.println("done.");
	}
}
