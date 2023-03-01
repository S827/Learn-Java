package Basics;
class PoolPuzzleOne{
	public static void main(String[] args) {
		int x = 0;
		
		while(x < 4){
			System.out.print("a");
			if(x < 1){
				System.out.print(" ");
			}
			System.out.print("n");
			if(x > 1){
				System.out.print(" oyster");
				x = x + 2;
			}
			if(x == 1){
				System.out.print("noys");
			}
			if(x < 1){
				System.out.print("oise");
			}
			System.out.println("");
			x = x + 1;
			//System.out.println(x);
		}
	}
}

/*	
a noise 1-a,2-space, 3-oise
annoys 
an oyster
1st we want a when x  =0/<1
2nd we want space when in 2nd condition whe


*/



