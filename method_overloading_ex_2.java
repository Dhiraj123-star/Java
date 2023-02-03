public class method_overloading_ex_2 {

    private static int displayInt(int a){
        return a;
    }
    private static float displayFloat(float a){
        return a;
    }
    private static String displayString(String a){
        return a;
    }
    public static void main(String[] args) {
        // calling the methods
        int resultInt = displayInt(12);
        float resultFloat = displayFloat(12.5f);
        String resultString = displayString("Java");

        System.out.println("The Int type : "+resultInt);
        System.out.println("The Float type: "+resultFloat);
        System.out.println("The String type: "+resultString);
    }
}
