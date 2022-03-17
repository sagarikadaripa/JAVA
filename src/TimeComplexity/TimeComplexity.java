package TimeComplexity;

public class TimeComplexity {
	
	public static void main(String args[]) {
		
		double now = System.currentTimeMillis();
		
		TimeComplexity tc = new TimeComplexity();
		System.out.println("Sum = " +tc.findSum(5) );		
		System.out.println("Time Taken = " +(System.currentTimeMillis() - now) + " millisec");
		
		System.out.println("Sum using loop= " +tc.findSum2(5) );
		System.out.println("Time Taken for loop = " +(System.currentTimeMillis() - now) + " millisec");
	}	
	
	public int findSum(int n) {
		return n*(n+1)/2;
	}
	public int findSum2(int n) {
		int sum = 0;
		for(int i = 1;i <=n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}