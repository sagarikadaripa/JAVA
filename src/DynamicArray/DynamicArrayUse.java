package DynamicArray;
import DynamicArray.DynamicArray;
public class DynamicArrayUse {
    public static void main(String[] args){
        DynamicArray da = new DynamicArray();
        for(int i = 0; i < 100; i++){
            da.add(100 + i);
        }
        System.out.println("Dynamic array size = "+da.size());
        if(da.isEmpty() == true)
            System.out.println("Array is EMPTY");
        else
            System.out.println("Array is NOT EMPTY");

        da.set(2000,3);
        System.out.println(da.get(3));

        while(!da.isEmpty()){
            System.out.println(da.removeLast());
            System.out.println(da.size());
        }
    }
}
