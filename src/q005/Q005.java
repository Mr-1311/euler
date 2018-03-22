
/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
package q005;

public class Q005 {
	
	public static void main(String[] args){
		int num = 21, result = 0;
		
		while(true){
			for(int i = 1; i <= 20; i++){
				if(num % i != 0){
					break;
				}
				if(i == 20){
					result = num;
				}
			}
			
			num++;
			if(result != 0)
				break;
		}
		
		System.out.println(result);
	}

}
