import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mystr ;
        System.out.print("Enter your string:  ");
        mystr=input.next(); //take input as String 

        switch (mystr) {
            case "Python":
             System.out.println("Python Programming Language");
                break;
            case "Java":
                System.out.println("Java Programming language");
                break;
            case "Go":
                System.out.println("Go Programming Language");
                break;
            default:
                System.out.println("Other programming language");
                break;
        }
        input.close(); // close the scanner object 
    }
    
}
