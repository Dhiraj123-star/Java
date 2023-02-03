// abstract class 
abstract class ProgrLang{
    abstract void language(); //abstract method 
}

class Java extends ProgrLang{
    public void language(){
        System.out.println("Java Programming language");
    }
}
class Go extends ProgrLang{
    public void language(){
        System.out.println("Go Programming language");
    }
}
class Rust extends ProgrLang{
    public void language(){
        System.out.println("Rust Programming language");
    }
}

public class abstract_class_2 {
    public static void main(String[] args) {
        //creating objects
        Java j1 = new Java();
        Go g1 =new Go();
        Rust r1 = new Rust();

        //calling methods
        j1.language();
        g1.language();
        r1.language();
        
    }
}
