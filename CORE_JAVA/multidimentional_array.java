public class multidimentional_array {
    public static void main(String[] args) {
        int multi_array[][]=new int[3][4];

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                multi_array[i][j]= (int) (Math.random() * 100);
                System.out.print(multi_array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int n[]:multi_array){  //different style of for loop
            for (int m:n){
                System.out.print(m +" ");
            }
            System.out.println();
        }


    }
}
