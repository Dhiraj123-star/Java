import java.util.Scanner;
public class RecursiveEx {
    public static int factorial(int n){
        if( n!=0){
            return n*factorial(n-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n= sc.nextInt();
        System.out.println("The factorial of "+ n + " is: "+factorial(n));
        sc.close();

    }
}
