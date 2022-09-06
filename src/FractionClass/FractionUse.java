package FractionClass;
import FractionClass.Fraction;
public class FractionUse {
    public static void main(String[] args){
        Fraction f1 = new Fraction(8,24);
        f1.print();
        // f1.increment();
        // f1.print();
        Fraction f2 = new Fraction(4,8);
        f2.print();
        // f1.add(f2);
        // f1.print();
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
    }
}
