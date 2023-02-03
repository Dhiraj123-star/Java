import java.lang.FunctionalInterface;
@FunctionalInterface
interface MyInterface1{
    // method with one argument 
    String reverse(String n);
}
public class lambda_ex_2 {
    public static void main(String[] args) {
        MyInterface1 myitr= (str)->{
            String result =" ";
            for (int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
                
            }
            return result;
        };
        System.out.println("The reversed String is: "+myitr.reverse("Python"));

        
    }
}
