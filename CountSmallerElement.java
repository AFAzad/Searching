import java.io.*;

public class CountSmallerElement {

    static int countElements(int arr[], int n, int key) {

        int i = 0;

        for (i = 0; i < n; i++) {

            if (arr[i] > key)
                break;
        }

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,3, 4, 5, 8, 9 };
        int key = 7;
        int n = arr.length;
        System.out.print("Smaller Element : "+countElements(arr, n, key));
    }
}
