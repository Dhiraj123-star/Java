import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit number: ");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i+=1;
        }while(n>=i);
        sc.close();
        
    }
    
}
