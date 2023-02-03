interface A1{
    //default method 
    default void display(){
        System.out.println("This is default method in interface");
    }

    //abstact method 
    void getColor(String s);
}

class B1 implements A1{
    public void getColor(String s){
        System.out.println("Your color in B : "+s );
    }

    // override default method of inteface
    public void display(){
        System.out.println("This is default in B ");
    } 
}
class c implements A1{
    public void getColor(String s){
        System.out.println("Your color in C: "+s);
    }
}


public class interface_ex_2 {
    public static void main(String[] args) {
        B1 b1 = new B1();

        b1.display();
        b1.getColor("Red");

        c c1 = new c();
        c1.getColor("Blue");
        //calling the default method of interface
        c1.display();

    }
}
