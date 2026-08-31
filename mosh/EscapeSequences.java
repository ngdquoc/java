import java.util.Arrays;
public class EscapeSequences { 
     public static void main(String[] args) { 
        String name = "Hello \"quoc\" "; 
        // use / and add any character after it
        // \n is used to add new line
        // \t is used to add tab space
        System.out.println("abc\ndef\tghi"); 
        // abc
        // def     ghi

        // show direct path of file in windows
        String path = "C:\\Users\\Admin-s\\Documents\\codingAus\\java";
        System.out.println(path);


        //array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        System.out.println(numbers);     
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(arr) );

      
      int[] arr2 = {5, 4, 3, 2, 1};
      System.out.println(Arrays.toString(arr2) ); 

      // method change the original array
      Arrays.sort(arr2);
      System.out.println(Arrays.toString(arr2));


       }
 }