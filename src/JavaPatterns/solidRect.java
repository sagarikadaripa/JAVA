/*  SOLID RECTANGLE
     * * * * * 
     * * * * *
     * * * * *
     * * * * *
     row = 4, column = 5
*/

package JavaPatterns;
class solidRect {
    
    public static void main(String[] args){

        for(int row = 1;row <= 4; row ++){
            for(int col = 1;col <= 5; col ++){
                System.out.print("*" + " ");
            }     
            System.out.println();     
        }
    }   
}
