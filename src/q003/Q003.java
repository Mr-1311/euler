
/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
package q003;

public class Q003 {

	public static void main(String[] args) {
		
		long remainder = 600851475143L;
		boolean isRemainderChange = false, isRemainderNotOne = true;
		while(isRemainderNotOne)
		{
			for(int i = 2; i <= remainder; i++){
				for (int j = 2; j <= i; j++) {
					if(i % j == 0 && j != i){
						//not prime
						break;
					}
					if(j == i){
						//prime
						if(remainder % i == 0){
							remainder = remainder / i;
							isRemainderChange = true;
							System.out.println(i);
						}
					}
				}
				if(isRemainderChange){
					isRemainderChange = false;
					if(remainder == 1){
						isRemainderNotOne = false;
						System.out.println("result = " + i);
					}
					break;
				}
			}
		}
	}
}
