import java.util.Date;
import java.awt.Point;
public class primitiveType {
    public static void main(String[] args) {

        // primitives are the most basic data types available within the Java language. 
        // There are 8 primitive data types in Java:
        byte myByte = 100;        // -128 to 127
        short myShort = 1000;      // -32,768 to 32,767
        int myNum = 5;               // -2,147,483,648 to 2,147,483,647
        long viewCount1 = 9_123_456_666L;// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


        double myDoubleNum = 5.99;   // Floating point number
        float myFloatNum = 5.99f;   // Floating point number

        char myLetter = 'D';         // Character

        boolean myBool = true;       // Boolean

        String myText = "Hello";     // String
        int viewCount = 123_456_666;
        System.out.println(viewCount); // 123456666

        //reference data types are used to store the reference of an object.
        //  (for storing complex object)
        // Car myCar = new Car();
       // DataType variableName = new DataType();

        Date now = new Date();
        // In Java, identifiers are the custom names developers use to label variables, classes, methods, or packages
        System.out.println("now");//now
        System.out.println(now); //Mon Aug 31 16:47:59 GMT+07:00 2026


        Point point1 = new Point(10, 20);
        Point point2 = point1;
        System.out.println(point1); // Point[x=10, y=20]
        point1.x = 100;
        System.out.println(point2.x); // 100

  
    public static void changeNumber(int x) {
        x = 100; // Thay đổi giá trị của biến x (bản sao)
    }
        int a = 5;
        changeNumber(a);
        System.out.println(a); // Kết quả vẫn là 5
// Giải thích: Khi gọi changeNumber(a), Java tạo ra một bản sao giá trị của a (là số 5) và gán vào biến x. Mọi thao tác đổi x = 100 trong hàm chỉ tác động lên bản sao x, biến a ở ngoài không hề ảnh hưởng.
//Tham trị (Pass-by-Value): Bạn đưa cho hàm một bản sao của lá thư (hoặc bản sao địa chỉ nhà). Nếu hàm xé bản sao đó hay vẽ lên nó, thư gốc không bị làm sao. Nhưng nếu hàm đi theo địa chỉ trên tờ giấy bản sao để vào nhà sửa đồ đạc, thì đồ đạc trong nhà thực sự bị thay đổi.

        String name = "John"; // String is a reference type
        name+= " Hopskin";
        System.out.println(name); // John Hopskin
        //string is a clas so we can access its methods by using the dot operator}
        System.out.println(name.length()); // 11
System.out.println(name.toUpperCase()); // JOHN HOPSKIN
        System.out.println(name.toLowerCase()); // john hopskin
        System.out.println(name.indexOf("H")); // 5
        System.out.println(name.replace("H", "J")); // John Jopskin
        System.out.println(name); // still John Hopskin any method that modifies the string 
        // will return a new string and will not modify the original string because strings are immutable in Java
    }
}
