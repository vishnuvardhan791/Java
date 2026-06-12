public class SelectionStatements {
    public static void main(String[] args) {
        // there are 3 types of selection statement 
        // 1. if 2. if-else 3. switch

        // here we also have some knowledge in if if-else lets make only 2 programs just to revise
        // the below example cover most of the concepts of ifelse

        int orderValue = 180;
        boolean is_member = true;
        int age = 68;
        double discount = 0;
        
        if(is_member){
            if(orderValue>150 && age>50){
                discount = 0.2;
                System.out.println("Applied: Senior Member Reward");
            }
            else if (orderValue>100){
                discount =0.1;
                System.out.println("Applied: Member Reward");
            }
            else{
                discount =0.05;
                System.out.println("Applied: Base Member Discount");
            }
        }
        else{
            if(orderValue>150){
                discount=0.1;
                System.out.println("Applied: Guest Volume Discount");
            }
            else{
                System.out.println("Applied: No Discount");
            }
        }

        // ternary operator example
        int shippingcost =(orderValue>=100) ? 0:20;

        System.out.println("Total Amount: "+((orderValue *(1-discount))+shippingcost));


        // now we see the switch statement
        /*
            switch has limited usecases 
                it can only evaluted to byte,short,int chat enum string
                    No duplicate cases allowed 
            switch is more efficient than if-else-if ladder
            in switch compiler directly goes to exact case wont go and compare all the cases like
            if else if ladder

            it is acheived using jump tables

                jump tables are formed only when need 
                there are 2 types of jump tables
                    1.table switch --> when i are dense(near to each other like 1,2,3,4)
                    2.lookup switch --> when i are sparse ( far like 1 10000 100000)=> it then 
                    uses the binary search 

            TO get better understanding look into the notes please 

         */
        int menuchoice = 2;

        switch (menuchoice) {
            case 1:
                System.out.println("Opening Account Balance...");
                break;
            case 2:
                System.out.println("money transfer");
                break;
            default:
                System.out.println("Invalid selection try again");
                break;
        }

    }
}
