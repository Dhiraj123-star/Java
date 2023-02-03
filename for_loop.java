import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your limit: ");
        int limit = input.nextInt();

        for (int i=1;i<=limit;i++){
            System.out.println(i);
        }
        // close the scanner class object 
        input.close();
    }
    
    
}
