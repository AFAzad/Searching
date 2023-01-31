public class Str_LinearSearch {
    public static void main(String[] args){

        String name[] = {"David", "Samual", "Caesar","William", "Marcuss", "Brustus"};

        String student = "Caesar";
        int temp =0;
        for(int i=0; i<name.length; i++){
            if(name[i].equals(student)){
                System.out.println(name[i]);
                temp= temp+1;
            }
        }
        if(temp==0){
            System.out.println("Name not found in student list ");
        }


        

    }
}
