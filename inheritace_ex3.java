//multilevel inheritance in java
class Animal1{ //first parent class 
    public void displayA(){
        System.out.println("Inside Animal class");
    }
}
class Dog1 extends Animal1{ //first child class
    public void displayD(){
        System.out.println("Inside Dog class");
    }
}
class Cat extends Dog1{ //second child class  
    public void displayC(){
        System.out.println("Inside Cat class");
    }
}


public class inheritace_ex3 {
    public static void main(String[] args) {
        // creating object 
        Cat c1 = new Cat();
        c1.displayA();
        c1.displayD();
        c1.displayC();
        
    }
    
}
