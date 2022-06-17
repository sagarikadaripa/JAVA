/*INVERTED HALF PYRAMID
    * * * *
    * * * 
    * * 
    * 
 */
package JavaPatterns;
public class invertedHalfPyramid {
    
public static void main(String[] args){

    int n=4;
    //approach 1
    /*for(i = n; i>=1; i--){
        for(j = 1;j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    } */
    //approach 2
    for(int i = 1;i <= n;i++){
        for(int j = 1;j<= n-i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

}
