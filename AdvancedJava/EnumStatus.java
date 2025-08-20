
/***************** Enum *********************
 *Enum is a class where Named Constant stored as an array
 *
 *mostly useful to give status
 *the keyword is enum
 * better to use switch for enum instead of ifelse
 *******************************************/

enum Status{
    Running,Failed, Pending, Success; //they are Named Constant
}

public class EnumStatus {
    public static void main(String[] args) {

        Status s=Status.Failed;

        System.out.println(s+":"+s.ordinal());

        Status[] ss=Status.values();

        for (Status status:ss){
            System.out.println(status+":"+status.ordinal());
        }

        Status s1=Status.Running;

        if(s1==Status.Failed)
            System.out.println("Please try again");
        if(s1==Status.Running)
            System.out.println("Going well");
        if(s==Status.Pending)
            System.out.println("Please wait");
        if(s1==Status.Success)
            System.out.println("Cool");

        Status s2=Status.Success;

        switch (s2) {              //better to use switch in enum as it contains constants
            case Status.Running:
                System.out.println("Going well");
                break;
        case Status.Failed:
            System.out.println("Please try again");
            break;
        case Status.Pending:
            System.out.println("Please wait");
            break;            
        default:
            System.out.println("Cool");
            break;
        }
      
    }
}
