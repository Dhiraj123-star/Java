public class for_each_ex_2 {
    public static void main(String[] args) {
        int [] numbers ={12,45,67};
        int sum=0;
        for (int num:numbers){
            sum+=num;
        }
        System.out.println("The sum is: "+sum);
    }
    
}
