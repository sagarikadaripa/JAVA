package FractionClass;

import FractionClass.Fraction;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(8, 0);
        f1.print();
        Fraction f2 = new Fraction(8, 12);
        f2.print();

        f1.add(f2);
        f1.print();
    }
}
