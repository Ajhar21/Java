public class bubbleSort {
    public static void main(String[] args) {
        int nums[]={7,8,4,6,9,1};
        int size=nums.length;
        int temp=0;

        System.out.print("Before the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }


        for (int i=0; i<size; i++){
            for (int j=0; j<size-i-1; j++){   //here j should end before last index
                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.println();

        System.out.print("After the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }
    }
}
