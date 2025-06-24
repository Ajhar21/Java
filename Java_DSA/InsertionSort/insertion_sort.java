
class insertion_sort {

    public static void main(String[] args){
        int nums[]={7,6,2,1,5};
        int size=nums.length;

        System.out.print("Before the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }

        for (int i=1; i < size; i++){ //interation start from 1 as first we assume already sorted
            int j=i-1;
            int key=nums[i];
            while(j>=0 && nums[j]>key){ // make sure use j>=0 first, condition will help to backtrack till 0
                /*
                The condition nums[j] > key && j >= 0 checks nums[j] before ensuring that j is non-negative.
                If j == 0 and nums[j] > key, j is decremented to -1, and then nums[j] tries to access nums[-1], which is out of bounds.
                 */
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;

        }

        System.out.println();

        System.out.print("After the sorting: ");
        for (int num : nums){
            System.out.print(" "+num);
        }
    }
}