
package Arrays;
public class roated {
    public static int BinarySearch(int arr[],int l,int h,int key){
        while(l <= h){
           int mid = l + (h - l)/2;
           if(key > arr[mid]){
            


           }
           if(arr[mid] == key)  return mid;
           else if(arr[mid] < key)
                l = mid + 1;
            else{
                h = mid - 1;
            }
       }
       return -1;
    }
}
