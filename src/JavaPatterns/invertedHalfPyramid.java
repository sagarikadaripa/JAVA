/*INVERTED HALF PYRAMID
    * * * *
    * * * 
    * * 
    * 
 */
package JavaPatterns;
public class invertedHalfPyramid {
    
public static void main(String[] args){

    int i,j,n=4;
    for(i = n; i>=1; i--){
        for(j = 1;j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

}
