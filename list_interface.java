import java.util.ArrayList;
import java.util.List;
public class list_interface {
   public static void main(String[] args) {
       // creating List using ArrayList class 
       List<Integer> listOfNums = new ArrayList<>();

       //add numbers to the list 


       listOfNums.add(12);
       listOfNums.add(120);
       listOfNums.add(100);

       System.out.println(listOfNums);

       //access the element of the list
       System.out.println(listOfNums.get(2));

       // remove element from the list 
       int removeNum = listOfNums.remove(1); 
       System.out.println("The removed element is: "+removeNum);

       
   } 
}
