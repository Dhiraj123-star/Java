import java.util.Iterator;
import java.util.Vector;

public class vector_ex {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        //add elements 
        nums.add(100);
        nums.add(200);
        nums.add(300);

        //display the elements 
        System.out.println(nums);
        //using add () method 
        nums.add(1, 500);
        System.out.println("After addition: "+nums);
        // new vector 
        Vector<Integer> num = new Vector<>();
        num.add(1000);
        //addAll() method 
        num.addAll(nums);
        System.out.println("New vector: "+num);

        // iterate through the element 
        Iterator<Integer> iterate = num.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(","); // to add comma 
        }
        // remove the element 
        int remove = num.remove(1);
        System.out.println("The removed element is: "+remove);
        System.out.println("After removing: "+num);
        // using clear() method
        num.clear();
        System.out.println(num);

    }
    
}
