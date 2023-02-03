import java.util.Arrays;

public class copy_array_5 {
    public static void main(String[] args) {
        int[][]source={{12,34,33},{120,34,90}};
        int[][]destination = new int[source.length][];

        for (int i=0;i<destination.length;++i){
            // allocating space for each row of destination
            destination[i]= new int[source[i].length];
            for (int j=0;j<destination[i].length;j++){
                destination[i][j]=source[i][j];
            }
        }
        System.out.println(Arrays.deepToString(destination));// used to provide a better representation of 
        //2-D Arrays 
    }
    
}
