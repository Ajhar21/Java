public class for_loop {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            System.out.println("Day "+i);

            for (int j=0;j<=8;j++){
                System.out.println("Hour "+ (j+9) +" - " + (j+10));
            }
            i++;
        }

       

        for (int k=1;k<=4;k++){
            System.out.println("Hello world");
            k++;
        }
    }
}
