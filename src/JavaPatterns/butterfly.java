/* Butterly Pattern n = 4
    *                           *
    *   *                   *   *
    *   *   *           *   *   *
    *   *   *   *   *   *   *   *
    *   *   *   *   *   *   *   *
    *   *   *           *   *   *
    *   *                   *   *
    *                           *
 */


package JavaPatterns;
public class butterfly {
    public static void main(String[] args){

        int  n = 6;
        
        for(int i = 1;i <= n;i++){
            //first half 
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            //2nd half
            for(int  j = 1;j <= 2*(n-i);j++){
                System.out.print(" "); //Spaces
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            //3rd half
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            //4th half
            int spaces  = 2*(n-i);
            for(int j = 1;j <= spaces; j++){
                System.out.print(" "); //Spaces
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
