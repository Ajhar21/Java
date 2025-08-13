
/***************** Enum *********************
 *Enum is a class where Named Constant stored as an array
 *
 *mostly useful to give status
 *the keyword is enum

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

        
    }
}
