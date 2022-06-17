/* floyd's Triangle 
    1                       row = 1    1 to 1     1 values
    2  3                    row = 2    2 to 3     2 values 
    4  5  6                 row = 3    4 to 6     3 values
    7  8  9  10             row = 4    7 to 10    4 values
    11 12 13 14 15          row = 5    11 to 15   5 values
*/




package JavaPatterns;
public class floydsTriangle {
    public static void main(String[] args){

        int n = 10;
        int count = 1;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }


    }
}
