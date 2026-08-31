public class multiArray {
    public static void main(String[] args) {
        int[][] myNumbers = new int[2][3];
        myNumbers[0][0] = 1;
        myNumbers[0][1] = 2;
        myNumbers[0][2] = 3;
        myNumbers[1][0] = 4;
        myNumbers[1][1] = 5;
        myNumbers[1][2] = 6;

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
