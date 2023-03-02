import java.util.*;
public class RBiSearch {

    public static int bSearch(int[] arr, int n, int low, int high){
        if(low > high) return -1;
        int mid = low +(high-low)/2;
        if(arr[mid] == n)
        return mid;
        if( n > arr[mid])
        return bSearch(arr, n, mid+1, high);
        return bSearch(arr, n, low, mid-1);  
    }

    public static void main(String[] args){
        RBiSearch ob = new RBiSearch();
        int arr[] = {4, 6, 9, 10, 12, 16};
        int len = arr.length;

        int n = 6;

        int ans = ob.bSearch(arr, n, 0, n-1);
        
        System.out.println("Element fount at index : "+ans);
    }
    
}
