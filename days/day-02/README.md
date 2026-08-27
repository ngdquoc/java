# Ngày 02 — Biến và kiểu dữ liệu

## Mục tiêu

- Khai báo và gán giá trị cho biến.
- Hiểu các kiểu `int`, `long`, `double`, `boolean`, `char` và `String`.
- Dùng `final` cho giá trị không được phép thay đổi.

## 1. Biến là gì?

Biến là một vùng có tên dùng để lưu dữ liệu:

```java
String name = "An";
int age = 20;
double height = 1.72;
boolean learningJava = true;
```
python
name = "An"
age = 20
height = 1.72
learning_java = True
```

Cấu trúc khai báo:

```
kiểu_dữ_liệu tên_biến = giá_trị;

```

Java kiểm tra kiểu dữ liệu khi biên dịch. Ví dụ sau không hợp lệ:
```java
int age = "hai mươi";
```

## 2. Các kiểu thường gặp

| Kiểu | Ví dụ | Mục đích |
|---|---|---|
| `int` | `20` | Số nguyên |
| `long` | `1_000_000L` | Số nguyên lớn |
| `double` | `1.72` | Số thập phân |
| `boolean` | `true` | Đúng hoặc sai |
| `char` | `'A'` | Một ký tự |
| `String` | `"Java"` | Chuỗi ký tự |

---------------------------------------------------------------------------------------------
`String` viết hoa chữ `S` vì nó là một class, không phải kiểu nguyên thủy.
## 3. Hằng số với `final`
---------------------------------------------------------------------------------------------

```java
final double PI = 3.14159;
```

Sau khi được gán, biến `PI` không thể nhận giá trị khác.

## Chạy ví dụ

Mở `Day02.java` trong VS Code và nhấn **Run** phía trên phương thức `main`.
Kết quả xuất hiện trong Terminal.

## Bài tập

### Bài 1

Tạo các biến lưu:

- Tên của bạn
- Tuổi
- Chiều cao
- Bạn có đang học Java hay không

Sau đó in chúng ra màn hình.

### Bài 2

Khai báo:

```java
final double PI = 3.14159;
double radius = 5;
```

Tính và in diện tích hình tròn theo công thức `PI * radius * radius`.

final double bi=3.14;
double ra=12;
double s=bi*bi*ra;

### Bài 3

Dự đoán đoạn code sau có biên dịch được không, rồi thử chạy:

```java
int number = 10;
number = 20;

final int fixedNumber = 10;
fixedNumber = 20;
```

## Tự kiểm tra

Bạn đã hoàn thành khi có thể:

- Chọn kiểu phù hợp cho tên, tuổi và chiều cao.
- Giải thích sự khác nhau giữa `int` và `double`.
- Giải thích tác dụng của `final`.
