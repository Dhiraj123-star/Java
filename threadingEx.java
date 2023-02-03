public class threadingEx extends Thread{
    public void run(){
    System.out.println("This code is running in thread");
    }
    public static void main(String[] args) {
        
        threadingEx obj = new threadingEx();
        obj.run();
    }
    
}
