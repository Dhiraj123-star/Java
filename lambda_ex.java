import java.lang.FunctionalInterface;
 // functional Interface
 @FunctionalInterface
 interface MyInterface{
     // abstract method 
     double getpiValue();
 }
public class lambda_ex {
    public static void main(String[] args) {
        // declare  a reference of MyInterface

        MyInterface myiter;
        // lambda expression

        myiter =()->3.14;
        System.out.println("The value of PI: "+myiter.getpiValue());
    }
    
}
