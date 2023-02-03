public class Main_exception {
    public static void main(String[] args) {
        try {
            int divide =90/0;
            System.out.println(divide);
            
        } finally {
            System.out.println("This statement is always executed");
  
        }
    }
}
