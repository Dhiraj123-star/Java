// hierarchical inheritance in java
class  Aa{
    public void displayA(){
        System.out.println("I am Class A");
    }
}
class Bb extends Aa{
    public void displayB(){
        System.out.println("I am class B");
    }
}
class Cc extends Aa{
    public void displayC(){
        System.out.println("I am class C");
    }
}

public class inheritance_4 {
    public static void main(String[] args) {
        
        Cc obj1 = new Cc();
        // calling the methods 
        obj1.displayA();
        obj1.displayC();
        
    }
}
