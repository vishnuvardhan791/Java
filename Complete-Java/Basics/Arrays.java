import javax.print.attribute.standard.MediaSize.Other;

public class Arrays {
    public static void main(String[] args) {
        // please refer notes they are some imp concepts 

        // 1-D Array
        int [] arr = new int[4];
        int x = 376; // here i am storing the values of 376 ,378,380,382
        for(int i=0;i<arr.length;i++){
            arr[i]=x;
            x+=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        // 2-d array 
        int [][] marks = new int[3][];

        marks[0] = new int[2];
        marks[1] = new int[3];
        marks[2] = new int[4];

        marks[0][0] = 35;
        marks[0][1] = 37;

        marks[1][0] = 39;
        marks[1][1] = 41;
        marks[1][2] = 43;

        marks[2][0] = 43;
        marks[2][1] = 45;
        marks[2][2] = 47;
        marks[2][3] = 49;

        for(int row =0;row<marks.length;row++){
            for(int col=0;col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }

    //     Other ways of declaring an array
	//          int [] rollNo = { 5,53,64,32};
	// 	        Here if we directly giving values then no need of giving size

	//      Same for 2-d 
	// 	        int [ ] [ ] marks = {
	// 					{ 41,63},
	// 					{43,25,64},
	// 					{94,53,77,55}
	// 				}
        

    }
}
