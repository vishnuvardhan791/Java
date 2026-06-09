public class TypeConversions {
    public static void main(String[] args) {
        byte b = (byte) 300; 
        // see here 300 will be done in binary and byte only see the 8 bit from right so it will 
        // ignore the other than 8 bit values that is the reson we get the value 44

        System.out.println("byte conversion: " +b);
        char ch = 'a';
        int i = ch;  
        // here why there is no error is like the ascii value will be taken a =97 that will be stored
        System.out.println("Implicit conversion: "+i);

        float f = 493.32f;
        int k = (int) f;

        System.out.println("Explicit conversion: "+k);
        
        
    }
}
