class myAnimal{
    protected String type;
    private String color;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public  String getColor(){
        return color;
    }
    public void setColor(String c){
        color=c;
    }
    
}
class myDog extends myAnimal{
    public void displayInfo(String c){
        System.out.println("My type is: "+type);
        System.out.println("My color is: "+c);
    }
    public void bark(){
        System.out.println("I can bark");
    }
}

public class inheritance_ex1 {
    public static void main(String[] args) {
        myDog d1 = new myDog();

        d1.bark();
        d1.sleep();
        d1.eat();

        // set the properties of Dog 
        d1.type="mammal";
        d1.setColor("Black");
        d1.displayInfo(d1.getColor());
        
        
    }
}
