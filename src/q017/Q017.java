
/*

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.


 */
package q017;

public class Q017 {
	public static void main(String[] args) {
		int zeroToNineteen[] = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8};
		int tenToHun[] = {0, 0, 6, 6, 5, 5, 5, 7, 6, 6};
		
		boolean go = true;
		int sum = 11, num;
		for (int i = 1; i < 1000; i++) {
			go = true;
			num = i;
			if (num / 100 > 0){
				if (num % 100 == 0){
					sum += (zeroToNineteen[num / 100] + 7);
					continue;
				}
				else {
					sum += (zeroToNineteen[num / 100] + 10);
				}
			}
			if (num / 10 > 0){
				if (num / 100 > 0){
					if ((num / 10) % 10 == 1){
						go = false;
						sum += zeroToNineteen[num % 100];
						}
					else {
						sum += tenToHun[(num / 10) % 10];
					}
				}
				else{
					if (num / 10 == 1) {
						go = false;
						sum += zeroToNineteen[num];
					}
					else{
						sum += tenToHun[num / 10];
					}
				}
			}
			if (go){
				sum += zeroToNineteen[num % 10];
			}
		}
		System.out.println(sum);
	}
}
