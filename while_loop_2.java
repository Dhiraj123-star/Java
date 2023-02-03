import java.util.Scanner;
public class while_loop_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        int sum=0;
        // while loop until number is positive
        while(num>=0){
            sum+=num;
            System.out.println("Enter your number: ");
            num= sc.nextInt();
        
        }
        System.out.println("The sum is: "+sum);
        sc.close();

    }
    
}
