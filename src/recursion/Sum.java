package recursion;

public class Sum {
    
    public static int summation(int n){
        if(n == 1){
            return 1;
        }
        int summ = summation(n-1)+n;
        return summ;
    }
    public static int power(int x, int n) {
        
        if(x == 0 && n > 0) return 0;
        if(x == 1 || n == 0) return 1;
        int ans = x * power(x,n-1);
        return ans;
		
	}
    public static int count(int n){
		//Write your code here
        if(n == 0){
            return 0;
        }
        int smallAns = count(n/10);
        return smallAns + 1;
    }

    public static void print(int n){
        if(n == 0) {
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    public static void print1(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print1(n--);
        System.out.print(n+" ");
    }
    public static void main(String[] args){

        // int ans = summation(10);
        // System.out.println(ans);
        // int ans = power(2,2);
        // System.out.println(ans);
        // int ans = count(156);
        // System.out.println(ans);

        print1(3);
    }
}
