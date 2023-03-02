public class DuplicateElem {
    public static void main(String args[]){
        int[] a = {4, 7, 3, 6, 5, 2, 3, 6};

        boolean flag = false; // if their will not any duplicate

        System.out.println("Duplicate Elements are : ");

        for(int i=0; i < a.length; i++){
            for(int j=i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    System.out.println( a[i]+" ");
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("Their is not any duplicate element");
        }

        
    }
}
