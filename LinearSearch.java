import java.util.*;
public class LinearSearch{
    //linear search also known as Sequential search
    public static void main(String[] args){
        // integer array
        int arr[] = {52, 63, 74, 85, 45, 59, 99};
        int item = 59;
        int temp = 0; // if item is not found 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == item){
                System.out.println(i);
                temp= temp+1;
            }
        }
        if(temp==0){
            System.out.println("item not found at any index");
        }


        

    }
}