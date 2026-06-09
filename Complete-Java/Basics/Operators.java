public class Operators {
    public static void main(String[] args) {
        // here i am skipping the basic operators like +,-.... +=,-=... ==,<=....
        int i = 5;
        int k = i++;
        // here what happening is  k=i then i=i+1 because of post increment

        System.out.println("The Value of K "+k+"\n the value of i "+i);
        
        int j = ++i;
        // in this case j = i+1 directly because of pre increment
        System.out.println("The Value of j "+j+"\n the value of i "+i);

        // normal bitwise operators 
        byte a = 2; // 00000010
        byte b = 3; // 00000011

        byte c = (byte) (a & b); // 2 because when both are 1 then only 1
        byte d = (byte) (a | b); // 3 because either of them is 1 then 1
        byte e = (byte) (a ^ b); // 1 because odd no of 1 then only 1 

        System.out.println(" &: "+c +"\n |: " + d+"\n ^: "+e );


        // bitwise shift operators 

        // here for this there is nice explanation in the notes please refer to it very instresting concept
        byte b1 = 6;
        b1 = (byte) (b1<<1);

        byte b2 = (byte) (b1<<34);// we perform modulo of 32 here and also the bitwise shif will perform
        // in int as we learned the concept of type promoting as after -128 next shift in byte will give all
        // 0 only so that is one of the reason 
        // same for right shift also and also in >> we store the value before in MSB as will be stored after shift
        // but in >>> we store 0 without viewing any previous value when we want only +ve values we use this

        // so better see notes to get better understanding
        byte b3 = (byte) (b1<<33);

        System.out.println(b1+" "+b2+" "+b3);

        // short circut concept
        // if we use d = (a<b) & (a<c) => it does not do short circuit 
        // if we use d = (a<b) && (a<c) => it will do short circuit

    }
}
