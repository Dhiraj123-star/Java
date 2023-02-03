import java.util.Scanner;
public class method_2 {
    // method defined 
    private static int getSquare(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num= sc.nextInt();
        //call the method 
        int result = getSquare(num);
        System.out.println("The Square of the "+num+ " is "+result);
        

        sc.close();
    }
    
}
