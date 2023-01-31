// import java.lang.annotation.Target;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args){

        int arr[] = {20, 25, 32, 36, 62, 67, 85, 98};
        int target = 85;
        int result = binarySearch(arr, target) ;
        
        System.out.println("Your target element found at index: "+ result);

    }
   
     public static int binarySearch(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            // Find middle elemnt
            int mid = si +(ei-si)/2;
            if(target < arr[mid]){
                ei = mid-1;
            }else if( target > arr[mid]){
                si = mid+1;
            }else{
                return mid;
            }
        }
        return -1; //if  element not found 
    }
    
}
