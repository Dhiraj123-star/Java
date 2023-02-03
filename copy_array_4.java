import java.util.Arrays;

public class copy_array_4 {
    public static void main(String[] args) {
        
        int [] source = {2,45,12,100};
        // copying entire source array to the destination array
        int[]destination = Arrays.copyOfRange(source, 0, source.length);
        System.out.println(Arrays.toString(destination));

        // copying from index 1 to 3 (where 3 is not included)
        int [] mydest= Arrays.copyOfRange(source, 1, 3);

        System.out.println(Arrays.toString(mydest));

    }
}
