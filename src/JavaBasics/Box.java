public class Box {
    

    private int length;
    private int breadth;
    private int height;

    //constructor helping in initializing the member variables
    public Box(){
        length = 10;
        breadth = 8;
        height = 4;
    }
    public static void main(String[] args){

        Box b1 = new Box();
        System.out.println("Length = "+b1.length);
    }
}
