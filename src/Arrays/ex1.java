package Arrays;
import java.util.*;
public class ex1 {
    public static int solve(int N, int a, int[] x) {
        // code here
        // int maxDis = 0;
        // for(int i = 0;i < N - 1;i++){
        //     for(int j = i + 1;j < N;j++){
        //         int first = (Math.abs(a - x[i]));
        //         int sec = (Math.abs(a - x[j]));
        //         int sum = (first + sec);
        //         if(sum > maxDis){
        //             maxDis = sum ;
        //         }
        //     }
        // }
        // return maxDis;
        //optimized solution
        int maxDis = 0;
        Arrays.sort(x);
        int r[] = {x[0],x[1],x[N-2],x[N-1]};
        if(N < 4) r = x;
        for(int i = 0;i < r.length - 1;i++){
            for(int j = i + 1;j < r.length;j++){
                int first = (Math.abs(a - r[i]));
                int sec = (Math.abs(a - r[j]));
                int sum = (first + sec);
                if(sum > maxDis){
                    maxDis = sum ;
                }
            }
        }
        return maxDis;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0;i <n;i++){
            x[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int res = solve(n,a,x);
        System.out.println("result = " + res);
    }
}
