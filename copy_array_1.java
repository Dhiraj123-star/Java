public class copy_array_1 {
    public static void main(String[] args) {
        int [] numbers = {12,34,60,100};
        int [] positiveNum =numbers; //copy the array using assignment operator 


        for (int item:positiveNum){
            System.out.println(item);
        }
        //change the value of the copy array
        positiveNum[2]=1000; 
        System.out.println("After updation: ");
        for (int item:positiveNum){
            System.out.println(item);
        }
    }
}
