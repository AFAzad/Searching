public class FirstOccurance {
    static int firstOccur(int[] a, int x, int n){
        int si = 0, ei = n-1, res = -1;
        while(si <= ei){
        int mid = si+(ei - si)/2;
        if(a[mid] > x)
        ei = mid-1;
        else if(a[mid] < x)
        si = mid+1;
        else{
            res = mid;
            ei = mid-1;
        }
    }
    return res;

    }
    public static void main(String[] args){
        int[] a = {1, 2, 2, 2, 3, 4, 5};
        int n = a.length;
        int x = 2;
        System.out.println("First Position is : "+ firstOccur(a, x, n));
    }
}
