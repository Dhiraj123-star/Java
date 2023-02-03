public class for_ex_2 {
    public static void main(String[] args) {
        char[]vowels = {'a','e','i','o','u'};

        System.out.println("Using For Loop");
        for (int i=0; i<vowels.length;i++){
            
            System.out.println(vowels[i]);
        }
        // using for-each loop

        System.out.println("Using for-each loop ");
        for (char ch:vowels ){
            
            System.out.println(ch);
        }
    }
    
}
