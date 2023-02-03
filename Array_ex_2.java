public class Array_ex_2 {
    public static void main(String[] args) {
        int [] age ={12,45,40,34};
        System.out.println("Using for Loop");
        for (int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }
        System.out.println("Using for-each Loop");
        for(int a:age){
            System.out.println(a);
        }
    }
}
