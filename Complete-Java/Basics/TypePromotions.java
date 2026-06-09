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

        //type promotion best example
        byte b1 = 12;
        short s = 459;
        int i1 = 7830;
        float f = 4405.494f;
        double dou = .12345;

        double result = (f*b1) + (i1/c) +(dou*s);
        // here byte is auto converted to float in f*b1 
        // c is converted to int in i1/c like wise dou*s also 
        
        System.out.println(f*b1+" + "+i1/c + " - "+ dou*s);
        System.out.println("result: "+result);




    }
}
