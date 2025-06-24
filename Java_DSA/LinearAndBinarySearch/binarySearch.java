public class binarySearch {

    public static int BinarySearchFunction(int list[], int target){
        int left=0;
        int right=list.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if (target==list[mid]){
                return mid;
            }
            else if(target>list[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int list[]={5,7,9,11,13};
        int target=7;

        int result=BinarySearchFunction(list,target);

        if (result != -1){
            System.out.println("The position of the value is : "+ result);
        }
        else{
            System.out.println("The value is out of list");
        }

    }
}
