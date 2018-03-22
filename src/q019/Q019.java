
/*

You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

 */
package q019;

public class Q019 {
	public static void main(String[] args) {
		int february = 28, result = 0, day = 1;
		int[] months = {31,february,31,30,31,30,31,31,30,31,30,31};
		
		for (int year = 1901; year < 2001; year++) {
			if (year % 100 != 0 && year % 4 == 0){
				february = 29;
			}
			if (year % 100 == 0 && year % 400 == 0){
				february = 29;
			}
			
			for (int j = 0; j < months.length; j++) {
				if (year == 2000 && j == months.length-1)
					continue;
				day = (day + months[j]+1) % 7;
				if (day == 0){
					result++;
				}
			}
			
			february = 28;
		}
		System.out.println(result);
	}
}
