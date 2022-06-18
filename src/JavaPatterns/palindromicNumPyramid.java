/* Palindromic number patterns
 *                          1
 *                      2   1   2
 *                  3   2   1   2   3
 *              4   3   2   1   2   3   4
 *          5   4   3   2   1   2   3   4   5
 */


package JavaPatterns;
public class palindromicNumPyramid {
    public static void main(String[] args){
        int n  = 5;
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= n-i; j++){
                System.out.print(" "); //spaces before the numbers
            }
            //first Half
            for(int  j = i;j>= 1;j--){
                System.out.print(j);
            }
            //second Half
            for(int  j = 2;j<= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
