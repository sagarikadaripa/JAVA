package FractionClass;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        if(denominator == 0) denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0) return;
        this.denominator = denominator;
    }
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator/= gcd;
        denominator/= gcd;
    }
    public void increment(){

        numerator  = numerator + denominator;
        simplify();
    }
    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
        this.denominator*= f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDenominator = f1.denominator * f2.denominator;

        Fraction f3 = new Fraction(newNumerator, newDenominator);
        return f3;
    }
   
}
