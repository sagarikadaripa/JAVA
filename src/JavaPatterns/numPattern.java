/* NUmber Pattern 
 *            1
 *         2    2  
 *      3    3     3
 *   4     4    4      4
 * 
 * 
 */



package JavaPatterns;
public class numPattern {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1;i <= n ;i++){
            for(int j = 1;j <= n-i; j++){
                System.out.print(" ");    //spaces before numbers
            }
            for(int j = 1; j<= i; j++){
                System.out.print(i + " ") ; //printing numbers
            }
            System.out.println();
        }
    }
}
