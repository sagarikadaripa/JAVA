package FractionClass;

public class ComplexNumbers {
    private int real;
    private int imaginary;
    
    ComplexNumbers(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void print(){
     
        System.out.println(real + " + " + "i"+imaginary);
       
    }
    
    public void add(ComplexNumbers c2){
        this.real+= c2.real;
        this.imaginary+= c2.imaginary;
    }
    public void multiply(ComplexNumbers c2){
        int storeReal = this.real;
        this.real = this.real * c2.real - this.imaginary * c2.imaginary;
        this.imaginary = storeReal * c2.imaginary + this.imaginary * c2.real;
    }
}
