import java.util.Arrays;

public class copy_array_7 {
    public static void main(String[] args) {
        String[][]programs = {{"Python","Java"},{"C","C++"},{"Go","C++","JavaScript"}};

        String[][]destination = new String[programs.length][];

        for (int i=0; i<programs.length;i++){
            destination[i]=new String[programs[i].length];
            System.arraycopy(programs[i], 0, destination[i], 0, destination[i].length);

        }
        //displaying  the array 
        System.out.println(Arrays.deepToString(destination));

    }
}
