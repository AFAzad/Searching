public class SearchRoatedArr {
    public static int searchRotatedArr(int[] num, int n){
        if(num == null || num.length == 0 ) {
            return -1;
        }
        int left = 0;
        int right = num.length-1;

        while( left < right){
            int mid = left + (right-left)/2;
            if(num[mid] > num[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = num.length-1;
        if(n >= num[start] && n <= num[right]){
            left = start;
        }else{
            right = start;
        }
        // searching

        while(left <= right){
            int mid = left +(right-left)/2;
            if(num[mid] == n){
                return mid;
            }
            else if(num[mid] < n){
                left= mid+1;
            }else {
                right = mid-1;
            }
        }
        return-1;
    }
    public static void main(String args[]){
        
    }
}
