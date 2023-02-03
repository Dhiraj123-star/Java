import java.util.Arrays;

public class copy_array_2 {
    public static void main(String[] args) {
        int[]nums ={12,45,60,100};
        int[] destinationArr= new int[4];

        for (int i=0; i<nums.length;i++){
            destinationArr[i]=nums[i];//copy the array (nums) to destinationArr

        }
        // converting the array to the string 
        System.out.println(Arrays.toString(destinationArr));
    }
}
