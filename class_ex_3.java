class Sum{
    public int a,b;
    public void display(){
        System.out.println("The sum is: "+(a+b));
    }

}

public class class_ex_3 {
    public static void main(String[] args) {
        Sum obj = new Sum();
        //access the class member variables 
        obj.a=12;
        obj.b=18;
    // access the class member function
        obj.display();
    }

}
