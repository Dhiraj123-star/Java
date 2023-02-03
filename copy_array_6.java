import java.util.Arrays;

public class copy_array_6 {
    public static void main(String[] args) {
       int  [][] source ={{12,120},{100,200,89}};

        int[][]destination= new int[source.length][]; 
        for(int i=0;i<source.length;i++){

            //allocating space for each row of destination
            destination[i]= new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }
        // displaying destination 2-D array
        System.out.println(Arrays.deepToString(destination));
    }
}
