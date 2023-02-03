import java.util.Scanner;
public class sum_of_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number upto which you want to sum: ");
        int sum=0; //initialise the sum variable 
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            sum+=i;

        }
        System.out.println("The Sum is: "+sum);
        sc.close();

    }
    
}
