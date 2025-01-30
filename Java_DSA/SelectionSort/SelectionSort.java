public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={7,8,4,6,9,1};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;

        System.out.print("Before the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }

        for (int i=0; i< size -1; i++){ //Last value sorted automatically
            minIndex=i;
            for (int j=i+1; j<size; j++){
                if (nums[minIndex]> nums[j])
                    minIndex=j;
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
            System.out.println();
            for (int num : nums){
                System.out.print(" "+num);
            }
        }

        System.out.println();

        System.out.print("After the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }
    }
}
