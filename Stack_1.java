import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> Animals = new Stack<>();

        //push elements to the Stack 
        Animals.push("Dog");
        Animals.push("Cat");
        Animals.push("Horse");
        Animals.push("Wolf");

        // display the stack 
        System.out.println(Animals);

        // peek() method 
        System.out.println("The first element is: "+Animals.peek());
        //search () method 
        int position = Animals.search("Horse");
        System.out.println("The position of Horse is: "+position);
        //pop() method 
        String removedElem= Animals.pop();
        System.out.println("The removed element is: "+removedElem);
        System.out.println("After deletion: "+Animals);
        //empty() uses for check stack is empty or not 
        boolean result = Animals.empty();
        System.out.println("Is stack empty? "+result);
    }
}
