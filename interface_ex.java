// interface in java

interface Polygon{
    void getArea(int len,int br); //abstract method 
}
//class implements the interface 
class Rectangle implements Polygon{

    public void getArea(int len,int br){
        System.out.println("Total Area is: "+len*br);
    }
}

public class interface_ex {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(12, 5);
    }
}
