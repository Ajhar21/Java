public class linearSearch{

    public static int  LinearSearchFunction(int list[], int target){
        for(int i=0; i<list.length; i++){
            if (list[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int list[]={5,7,9,11,13};
        int target=11;

        int result= LinearSearchFunction(list,target);

        if (result != -1){
            System.out.println("The position of value is: "+ result);
        }
        else{
            System.out.println("Value isn't in the list");
        }
    }
}