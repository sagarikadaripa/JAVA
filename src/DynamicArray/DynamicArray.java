package DynamicArray;

public class DynamicArray {
    private int arr[];
    private int nextElementIndex;


    public DynamicArray() {
        arr = new int[5];
        nextElementIndex = 0;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public int size(){
        return nextElementIndex;
    }

    public int get(int idx){
        if(idx >= nextElementIndex){
            return -1;
        }
        return arr[idx];
    }

    public void set(int ele,int idx){
        if(idx >= nextElementIndex){
            return;
        }
        arr[idx] = ele;
    }

    public void add(int ele){
        if(arr.length == nextElementIndex){
            doubleCapacity();
        }
        arr[nextElementIndex] = ele;
        nextElementIndex++;
    }
    private void doubleCapacity() {
        int temp[] = arr;
        arr = new int[2*temp.length];
        for(int i = 0 ;i < temp.length;i++){
            arr[i] = temp[i];
        }
    }

    public int removeLast(){ 
        if(isEmpty()){
            return -1;
        }
        int eleRemoved = arr[nextElementIndex - 1];
        nextElementIndex--;
        return eleRemoved;
    }
}
