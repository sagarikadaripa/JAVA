/*Inverted Half Pyramid with Numbers and
    1 2 3 4 5          row = 1    1 to 5
    1 2 3 4            row = 2    1 to 4 ==> n-i+1
    1 2 3              row = 3    1 to 3 
    1 2                row = 4    1 to 2
    1                  row = 5    1 to 1
*/






package JavaPatterns;
public class invertedHalfPyramidNums {

    public static void main(String[] args){

        int n = 5;
        //Approach 1
    /* for(int  i = n;i >= 1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        } */
        //Approach 2
        for(int i = 1;i<=n;i++){
            for(int j = 1;j <= n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
