package FractionClass;

public class ComplexUse {
    
    public static void main(String[] args){

        ComplexNumbers c1 = new ComplexNumbers(4,-5);
        //c1.print();
        ComplexNumbers c2 = new ComplexNumbers(1,-2);
        // c1.add(c2);
        // c1.print();
        c1.multiply(c2);
        c1.print();
    }
}
