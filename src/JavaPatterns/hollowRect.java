/*  HOLLOW RECTANGLE
    * * * * *     
    *       * 
    *       *
    * * * * *

    row = 4, col = 5
 */
package JavaPatterns;
public class hollowRect {
    public static void main(String[] args){

        int n = 4;
        int m = 5;
        //outer loop for rows  and inner loop for columns
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= m;col ++){
                if(row == 1 || row == n || col == 1 || col == m)
                    System.out.print("*" + " ");
                else
                System.out.print(" " + " ") ;
            }
            System.out.println();
        }
    }
}
