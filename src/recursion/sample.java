package recursion;
public class sample {
    public static void print(int i){

        //base condition
        if(i < 1)
            return;
        System.out.println("Printing "+i);
        print(i - 1);
    }
    public static void main(String[] args){
        print(5);
    }
}
