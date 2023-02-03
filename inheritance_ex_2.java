class Programs{
    public void display(){
        System.out.println("I am doing program");
    }
}
class Python extends Programs{
    @Override
    public void display(){
        super.display(); // super is used for call parent's class method
        System.out.println("I am doing Python programming");
    }
    public void coding(){
        System.out.println("Coding in Python");
    }
}

public class inheritance_ex_2 {
    public static void main(String[] args) {
        Python p1 = new Python();
        p1.display();
        p1.coding();
        
    }
}
