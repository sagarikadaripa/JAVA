/* 0-1 Triangle

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */

//LOGIC = Matrix row + col value is even then print 1 else print 0 and number of rows = number of values in each line
package JavaPatterns;
public class zeroOneTriangle {
    
    public static void main(String[] arg){

        int n = 5;
        for(int i = 1;i <= n;i++){
           for(int j = 1;j <= i;j++){
               if((i + j)%2 == 0)
               {
                   System.out.print("1 ");
               }
               else{
                System.out.print("0 ");
               }
           } 
           System.out.println();
        }

    }
}
