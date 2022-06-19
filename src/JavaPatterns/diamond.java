/*  diamond Pattern
                *  
            *   *   *
        *   *   *   *   * 
    *   *   *   *   *   *   *
        *   *   *   *   * 
            *   *   *   
                *
 */


package JavaPatterns;
public class diamond {
    public static void main(String[] args){

        int n = 4;
        //1st half
        for(int i = 1;i <= n; i++){
            for(int  j = 1;j <= n - i ;j++){
                System.out.print(" "); //spaces before stars
            }
            for(int j = 1;j <= 2*i - 1;j++){
                System.out.print("*"); //stars
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i >= 1; i--){
            for(int  j = 1;j <= n - i ;j++){
                System.out.print(" "); //spaces before stars
            }
            for(int j = 1;j <= 2*i - 1;j++){
                System.out.print("*"); //stars
            }
            System.out.println();
        }
    }
}
