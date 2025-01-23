public class array_3D {
    public static void main(String[] args) {
        int nums[][][]=new int[3][3][2];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                for (int k=0;k<2;k++){
                    nums[i][j][k]=(int) (Math.random()*100);
                    System.out.print(nums[i][j][k]+" ");
                }

                System.out.println();
            }
        }
    }
}
