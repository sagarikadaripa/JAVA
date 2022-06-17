/* Inverted half pyramid rotated by 180 degree */

/*              *     3space + 1star = 4 ==> n-1 spaces + 1star
            *   *     2space + 2star = 4 ==> n-2 spaces + 2star
        *   *   *     1space + 3star = 4 ==> n-3 spaces + 3star
    *   *   *   *     0space + 4star = 4 ==> n-4 spaces + 4star
 */


package JavaPatterns;
public class invertedHalfPyramidRotated {
    public static void main(String[] args){
        int n = 4;
        for(int i = 1;i <= n;i ++){
            for(int j = 1;j <=(n - i);j++){ //spaces
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){ //stars
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
