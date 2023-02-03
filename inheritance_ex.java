class A{
    public void displayA(){
        System.out.println("This is A");
    }
}
class B extends A{
    public void displayB(){
        System.out.println("This is B");
    }
}

public class inheritance_ex {
    public static void main(String[] args) {
        B b1 = new B();
        b1.displayA();
        b1.displayB();
        
    }
}
