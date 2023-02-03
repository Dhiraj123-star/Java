//abstract class 

abstract class AbstractClass{
    // abstract method 
    abstract void display(); 

    // non-abstract method 
    public void displayme(){
        System.out.println("This is non-abstract method");
    }
}
class RegularClass extends AbstractClass{
    public void display(){
        System.out.println("This is implemented method");
    }
}

public class abstract_ex1 {
   public static void main(String[] args) {
       // creating object 
       RegularClass c1 = new RegularClass();
       c1.display();
       c1.displayme();
   } 
}
