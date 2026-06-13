import java.util.Scanner;

public class IterationAndJumpStatements {
    public static void main(String[] args) {
        
        // Iteration statements ther loops are of 3 =>  for while do-while
        // while loop lets look into real world example
        Scanner sc = new Scanner(System.in);

        final String correctPassword = "Vishnu123";

        boolean isAllowed = false;
        int loginAttempts = 0;
        final int maxLoginAttempts = 3;

        while (!isAllowed && loginAttempts<maxLoginAttempts) {
            System.out.println("Enter Password: ");
            String userEnteredPassword = sc.nextLine();

            loginAttempts++;
            if(userEnteredPassword.equals(correctPassword)){
                isAllowed=true;
                System.out.println("Welcome to DashBoard");
            }
            else{
                int remaining = maxLoginAttempts-loginAttempts;
                System.out.println("Remaining attempts allowed are "+remaining);
            }
        }
        if(!isAllowed){
            System.out.println("Accound freesed due to multiple failed logins");
        }
        sc.close();

        /*
            And now the do-while loop it will be used when when you want to execute the loop atleast
            once withoud checking any condition 

            the flow will be like first one time it will be executed and then check the codition 
            if true then again execute the block else move out of it 

            do{
                menu list you want to display at first 
                like
                    1.view books
                    2. view toys
                    3. exit
                    so here the loop will be executed and the user move to differen pages till the 
                    user press the exit button
            }while(n!=3)
         */
        
         // variations of for loop

         int i =0;
         for(;i<5;i++){
            System.out.println(i);
         }

         // we can make a for loop to work as infinte loop also
         /* 
                for(;;i++)  ==> here there is no uppercondition so it will run until out of memory

                for(;i<10;)  ==> here no increment of value so here also infinte loop

          */

          /*
             Comma seperated variation
                    These are used when you want to use more than 1 variable in for loop
           */
          for(int k=1,j=1;j<10;k++,j+=2){
            System.out.println(k+" "+ j);
          }

          /*
                NOTE:
                    Generally we use int in for loops even the value is small why because
                    type promotion will be happened inside the loop to int from byte and short
                    internally
           */

           /*
                Jump statements => break,continue

                    these are used to change the flow of execution in loops 
                    break => come of the loop 
                    continue => will stop the current execution of loop and continue with next value

            */

            int p=7;
            int v=2;
            for(;v<p;v++){
                if(p%v == 0){
                    System.out.println(p+" is not a Prime number");
                    break;
                }
            }
            if(p==v){
                System.out.println(p+" is a prime number");
            }
            
            /*
                here in the above example we used break 
                    it will reduce the no of iterations if the condition is met

                    that is most important when we it comes to performance
             */

             for(int m=1;m<=10;m++){
                if(m%2==0) continue;
                System.out.println(m);
             }
             /*
                Here we are printing only odd numbers and skipping the even number iterations
                this is the example of continue statement
              */

              //  Labels ==> these are like we are giving name to loops so that we can break or continue directly
             outer : for(int n=1;n<10;n++){
                inner: for(int c =1;c<=n;c++){
                    System.out.print("* ");
                    if(c>=5) break inner;
                    if(c>7) break outer;
                }
                System.out.println();
             }
             // if you observe the o/p we are able to control the flow of * using the labels
    }
}
