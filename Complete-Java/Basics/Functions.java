public class Functions {
    public static void main(String[] args) {
        int i=4,j=8;
        System.out.println(sum(i,j));

        greet();

        hello("vishnu");

        System.out.println(getLuckyNumber());

        overload(22,"vardhan");
        overload("vishnu", 23);
    }
    // with i/p and o/p
    static int sum(int a,int b){
        return a+b;
    }

    // no i/p no o/p
    static void greet(){
        System.out.println("Hi vishnu this is one type of function");
    }

    //i/p  no o/p
    static void hello(String s){
        System.out.println("Hello "+s+" how are you");
    }

    // no i/p  o/p
    static int getLuckyNumber(){
        return 7;
    }

    // here the function is same with parameters 
    // but in different order that also possible in overloading


    static void overload(int a, String n){
        System.out.println("hi "+n+" i think your age is "+a+" according to fn1");
    }

    static void overload( String n,int a){
        System.out.println("hi "+n+" i think your age is "+a+" according to fn2");
    }

    

}
