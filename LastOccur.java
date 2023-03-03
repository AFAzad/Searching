public class LastOccur{

    public static int lastOccur(int[] a, int x, int n){
        int si = 0, ei = n-1, res = -1;
        while(si <= ei){
            int mid = si + (ei-si)/2;
            if(a[mid] > x){
                ei = mid - 1;
            }else if(a[mid] < x){
                si = mid + 1;
            }else{
                res = mid;
                si = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] a = {7, 8, 9, 10, 11, 11, 15};
        int n = a.length;
        int x = 11;

        System.out.println("Last Occurace is : "+lastOccur(a, x, n));

    }
}