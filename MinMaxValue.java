public class MinMaxValue {
    public static void main(String[] args){
        int[] arr = {30, 40, 20, 60, 10, 80, 50};
        int min = arr[0]; // let min elem is at index 0;

        

        // min element
        for(int i=1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min element is : "+min);
        System.out.println();
        
        // max element 
        int max = arr[1]; // We assume that max elem is at index 1.
        
        for(int i=0; i <arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max element is : " +max);
    }
}
