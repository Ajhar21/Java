public class while_loop {
    public static void main(String args[]){
        int i=1; //day

        while(i<=7){
            System.out.println("Day "+i);
            int j=1;
            while(j<=24){
                System.out.println("Hour "+j);
                j++;
            }
            i++;
        }
    }
}
