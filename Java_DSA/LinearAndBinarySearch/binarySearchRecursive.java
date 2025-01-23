public class binarySearchRecursive {

    public static int BinarySearchRecursive(int list[], int target, int left, int right){
        
        if (left<=right){
            int mid=(left+right)/2;
            if (target==list[mid])
                return mid;
            else if(target < list[mid])
                return BinarySearchRecursive(list, target, left, mid-1);
            
            else
                return BinarySearchRecursive(list, target, mid+1, right);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int list[]= new int[1000];
        // int list[]={5,7,9,11,13};
        int target=0;
        int left=0;
        int right=list.length-1;

        int result= BinarySearchRecursive(list,target,left,right);

        if (result != -1) 
            System.out.println("The position of target value is: "+ result);
        else
            System.out.println("Value is out of range");
        

    }
}
