import java.util.LinkedList;
import java.util.List;

public class linked_list {
    public static void main(String[] args) {
        //creating linked list 
        List<String> programminglans = new LinkedList<>();
        List<String>myProgramminglang=new LinkedList<>();
        // add the elements in the list 
        programminglans.add("Python");
        programminglans.add("Java");
        programminglans.add("C");
        programminglans.add("Go");

        // printing the elements of the list 
        System.out.println(programminglans);
        // access from the list 
        String value = programminglans.get(1);
        System.out.println(value);
        //remove from the list 
        String removed = programminglans.remove(2);
        System.out.println("The removed element is: "+removed);
        // use of indexof ()
        int find = programminglans.indexOf("Java");
        System.out.println("Index of Java is: "+find);
        //addall () method 
        myProgramminglang.addAll(programminglans);
        System.out.println(myProgramminglang);





    }
}
