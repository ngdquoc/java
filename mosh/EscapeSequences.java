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
//    int[] arr = {1, 2, 3, 4, 5}
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
// Trong Java, **`numbers.length` là một thuộc tính (field/property), KHÔNG phải là một phương thức (method).**

// Dù `numbers` là một biến tham chiếu (reference variable) trỏ đến đối tượng mảng trên bộ nhớ Heap, bạn sử dụng dấu chấm `.` để truy cập thuộc tính của nó, chứ không phải gọi phương thức.

// Dưới đây là điểm khác biệt quan trọng:

// * **Mảng (Array):** Dùng thuộc tính `.length` (không có dấu ngoặc tròn `()`).
// * Ví dụ: `numbers.length`


// * **Chuỗi (String):** Dùng phương thức `.length()` (có dấu ngoặc tròn `()`).
// * Ví dụ: `str.length()`


// * **Danh sách (ArrayList / List):** Dùng phương thức `.size()`.
// * Ví dụ: `list.size()`



// Vì `length` của mảng là một thuộc tính hằng số (final field) được tạo sẵn cho mỗi đối tượng mảng trong Java, bạn truy cập trực tiếp giá trị của nó qua toán tử dấu chấm `.` mà không cần gọi hàm.
      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(arr) );

      
      int[] arr2 = {5, 4, 3, 2, 1};
      System.out.println(Arrays.toString(arr2) ); 

      // method change the original array
      Arrays.sort(arr2);
      System.out.println(Arrays.toString(arr2));


       }
 }
