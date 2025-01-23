import java.util.Scanner; 
public class switch_case{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enetr a Number: ");
        int day=scan.nextInt();
        //int day=2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Entar number 1 or 2");
                break;
        }
        
    }
}