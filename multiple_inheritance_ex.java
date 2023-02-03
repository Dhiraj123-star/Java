// multiple inheritance in java (through interfaces) 
interface first{
    void displayfirst();//abstract method 
}
interface second{
    void displaysecond(); //abstract method 
}

class third implements first, second{
    public void displayfirst(){
        System.out.println("Method of first Interface");
    }
    public void displaysecond(){
        System.out.println("Method of second interface");
    }
    public void display(){
        System.out.println("Method of class C");
    }
}

public class multiple_inheritance_ex {
    public static void main(String[] args) {
        // creating object of class third
        third t1 = new third();
        t1.display();
        t1.displayfirst();
        t1.displaysecond();
    }
}
