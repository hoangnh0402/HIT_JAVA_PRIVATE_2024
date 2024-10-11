
# 🎉 Buổi 1: Khởi Đầu Hành Trình Java 🚀

Chào mừng các bạn đến với khóa học Java! Trong buổi đầu tiên này, chúng ta sẽ cùng nhau làm quen và xây dựng nền tảng vững chắc cho những buổi học tiếp theo. Dưới đây là các nội dung chính của buổi học:

---

## 👋 Giới Thiệu & Làm Quen Mọi Người

- **Giới thiệu Leader, Supporter và bạn HIT15**
- **Tạo không khí thân thiện và khuyến khích sự tương tác**
- **Hoạt động nhỏ để mọi người biết nhau hơn**
- **Mọi người sẽ được gặp gỡ, trò chuyện với các anh chị cựu của lớp Java, hãy suy nghĩ và đặt các câu hỏi cho anh chị để được giải đáp thắc mắc nhá!**

---

## 📁 Hướng Dẫn Sử Dụng GitHub Cơ Bản để Nộp BTVN

GitHub là công cụ quan trọng giúp chúng ta quản lý mã nguồn và nộp bài tập hiệu quả. Trong phần này, bạn sẽ học:

- **Tạo tài khoản GitHub**
- **Tạo repository cho dự án Java**
- **Cách commit và push code lên GitHub**
- **Cách nộp bài tập thông qua GitHub**

```bash
# Nộp bài tập lên github
git add .
git commit -m "Initial commit"
git push -u origin main
```

---

## 🖥️ Cấu Trúc Chương Trình Java

Hiểu rõ cấu trúc cơ bản của một chương trình Java là bước đầu quan trọng để viết mã hiệu quả.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

- **Class**: Định nghĩa một lớp trong Java
- **Method**: Phương thức `main` là điểm bắt đầu của chương trình
- **Statement**: Câu lệnh in ra màn hình

---

## 📥📤 Nhập, Xuất & Kiểu Dữ Liệu

### 1. Nhập Dữ Liệu

Sử dụng lớp `Scanner` để nhận dữ liệu từ người dùng.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Chào " + name + "!");
    }
}
```

### 2. Xuất Dữ Liệu

Sử dụng `System.out.println` để hiển thị thông tin ra màn hình.

---

## 🛠️ Kiểu Dữ Liệu

- **Số nguyên**: `int`, `long`
- **Số thực**: `float`, `double`
- **Ký tự**: `char`
- **Logic**: `boolean`
- **Chuỗi**: `String`

```java
int age = 25;
double salary = 75000.50;
char initial = 'A';
boolean isStudent = true;
String fullName = "Nguyễn Văn A";
```

---

## 📝 Biến & Quy Tắc Đặt Tên Biến, Class

### 1. Biến

Biến là nơi lưu trữ dữ liệu trong chương trình.

```java
int age = 25;
double salary = 75000.50;
String fullName = "Nguyễn Văn A";
boolean isStudent = true;
```

### 2. Quy Tắc Đặt Tên

- **Biến**: sử dụng `camelCase` (ví dụ: `fullName`, `totalAmount`)
- **Class**: sử dụng `PascalCase` (ví dụ: `Student`, `EmployeeService`)
- Không dùng ký tự đặc biệt hoặc bắt đầu bằng số khi đặt tên biến và class.

---

## ➕➖ Phép Toán & Toán Tử

Java hỗ trợ nhiều toán tử để thực hiện các phép toán cơ bản và nâng cao.

### 1. Các Toán Tử Cơ Bản

- **Cộng**: `+`
- **Trừ**: `-`
- **Nhân**: `*`
- **Chia**: `/`
- **Chia lấy dư**: `%`

```java
int a = 10;
int b = 3;

System.out.println("a + b = " + (a + b)); // 13
System.out.println("a - b = " + (a - b)); // 7
System.out.println("a * b = " + (a * b)); // 30
System.out.println("a / b = " + (a / b)); // 3
System.out.println("a % b = " + (a % b)); // 1
```

### 2. Toán Tử So Sánh

- **Bằng**: `==`
- **Khác**: `!=`
- **Lớn hơn**: `>`
- **Nhỏ hơn**: `<`
- **Lớn hơn hoặc bằng**: `>=`
- **Nhỏ hơn hoặc bằng**: `<=`

### 3. Toán Tử Logic

- **Và**: `&&`
- **Hoặc**: `||`
- **Phủ định**: `!`

```java
boolean isAdult = age >= 18;
boolean hasPermission = true;

if (isAdult && hasPermission) {
    System.out.println("Được phép tham gia.");
} else {
    System.out.println("Không được phép tham gia.");
}
```

---

Hãy cùng thực hành những nội dung trên và chuẩn bị cho buổi học nha! 💪
