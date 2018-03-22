
/*

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?

 */
package q015;

public class Q015 {
	
	private int i=0, j=0, s=0, n = 20,bit = 0;
	private long Result = 0L;
	private int[][] path = new int[n*2][2];
	
	private int getBit(){
		return bit;
	}
	
	private void printResult(){
		System.out.println(Result*2);
	}
	private void goBack(){
		s--;
		if(s == 0)
			bit = 1;
		i = path[s][0];
		j = path[s][1] + 1;
		path[s][0] = 0;
		path[s][1] = 0;
	}
	
	private void check(){
		if(i == n && j == n){
			Result++;
			goBack();
		}
		if(i+1 < n+1 && j+1 < n+1){
			path[s][0] = i;
			path[s][1] = j;
			s++;
		}
	}
	
	private void forward(){
		if(i+1 < n+1){
			i++;
			return;
		}
		j++;
	}
	
	public static void main(String[] args) {
		Q015 o = new Q015();
		
			while(true){
				o.check();
				if(o.getBit() == 1){
					break;
				}
				o.forward();
				
			}
			o.printResult();
		
	}
}
