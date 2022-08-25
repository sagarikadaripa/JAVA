package Arrays;

import java.util.*;

public class abc {
   
    public static void main(String[] args){
       
       int array[] = {1,4,2,-2,-9,10,2,12,2,-4,-4,-4,-4,2,6,7};
       int peak = array[0];
       int index = 0;
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int x=1; x <= array.length - 1; x++){
            if (array[x]*array[x-1] > 0){
                if (peak < 0 && array[x] < peak){
                    peak = array[x] ;
                    index = x; 
                }
                if(peak >= 0 && array[x] > peak){
                    peak = array[x]; 
                    index = x; 
                }
                else{
                    map.put(index,peak);
                    peak = array[x]; 
                    index = x;
                }
            }
       }
       for(Map.Entry<Integer, Integer> me : map.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
       }
    }
}
