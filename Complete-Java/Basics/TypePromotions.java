public class TypePromotions {
    public static void main(String[] args) {
        // automatic type promotions
        byte b = 50;
        byte c = 40;
        byte d = 100;

        int i = (b*c)/d; 
        // int the above expression  b*c is 2000 it is outside the range of byte
        // so java auto converts it into int like wise same for result also 

        System.out.println("Automatic type promotion: "+i);

        // byte to int conversion
        byte bi = 60;
        bi = (byte) (bi*2);
        // here explicit is needed and if we miss it will treat it as int so we get error
        
        System.out.println("byte to int eg : "+bi);


    }
}
