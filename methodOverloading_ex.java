public class methodOverloading_ex {

    private static void  Add(int a,int b){
        System.out.println("The sum of two numbers: "+(a+b));
    }
    private static void Add(int a,int b,int c){
        System.out.println("The sum of three numbers: "+(a+b+c));
    }
    public static void main(String[] args) {
        //call the methods 
        Add(12,13); // two arguments 
        Add(12,56,78); // three arguments 
        
    }
    
}
