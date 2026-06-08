public class Datatypes{
    public static void main(String[] args) {
        byte b = 0b101; //  can also be written as  b=5  0b is for binary
        short s = 0xA; // can also be written as s =10 0x is for hexadecimal
        int i = 890;
        long l = 98_78_89_123; // we can use this instead of , to differenciate the digits

        float f = 23.94f; // f is mandatory as it will differeciate whether is it float or double
        double d = 839.23456;

        char ch = 'a'; 
        boolean bool = true;

        System.out.println("byte:"+b+"\n short:"+s+"\n int:"+i+"\n long:"+l+"\n float:"+f+"\n double:"+d+"\n char:"+ch+"\n boolean:"+bool);
    }
}