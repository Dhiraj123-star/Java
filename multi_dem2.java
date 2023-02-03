public class multi_dem2 {
    public static void main(String[] args) {
        int[][]a={
            {12,34,60},
            {12,56,78,100},
            {90}
        };
        System.out.println("Using for loop");
        for(int i=0; i<a.length;i++){
            for (int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println(); // for new line
        }
        System.out.println("Using for-each loop");
        for (int[]innerArray:a){
            for (int data:innerArray){
                System.out.println(data);
            }
            System.out.println(); // for new line 
        }
    }
    
}
