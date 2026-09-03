import java.util.Arrays;

public class multiArray {
    public static void main(String[] args) {
        int[][] myNumbers = new int[2][3];
    // 10 20 0 
    //  0  0 30
//    0 0 10
//    0 1 20
//    1 2 30

// int[][] myNumbers2 = { {10, 20, 0}, {0, 0, 30} };
    
        myNumbers[0][0] = 10;
        myNumbers[0][1] = 20;
        myNumbers[1][2] = 30;   
        
         System.out.println(Arrays.deepToString(myNumbers) ); 
         // deepToString() method is used to print multi-dimensional array in a readable format

        // for (int i = 0; i < myNumbers.length; i++) {
        //     for (int j = 0; j < myNumbers[i].length; j++) {
        //         System.out.println(myNumbers[i][j]);
        //     }
        // }

    }
}
