package Static;

public class Student {
    
    int id;
    String name;
    static String clg = "SBS";
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [clg=" + clg + ", id=" + id + ", name=" + name + "]";
    }
    
}
