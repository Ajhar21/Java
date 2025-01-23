public class array {
    public static void main(String[] args) {
        int array[ ]={1,2,3,4,5};  //static array

        for (int i=0; i<5; i++){
            System.out.println(array[i]);
        }

        int d_array[]=new int[5];  //dynamic array, value can be assigned

        for(int i=0; i<5; i++){
            if (i<3)
                d_array[i]=50;
            else 
                d_array[i]=100;
            System.out.println(d_array[i]);
        }
    }
}
