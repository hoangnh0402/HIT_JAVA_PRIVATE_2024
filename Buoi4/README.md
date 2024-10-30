# Buổi 4

## 1. Static và final

- Static: Trong Java, từ khóa "static" được sử dụng để khai báo một thành phần (biến hoặc phương thức) thuộc về lớp chứ không thuộc về các thể hiện cụ thể của lớp đó. Điều này có nghĩa là khi một biến hoặc phương thức được khai báo là static, chúng có thể được truy cập thông qua tên lớp mà không cần tạo ra một thể hiện của lớp đó.
    - Thuộc tính static (static variables)
    - Phương thức static (static methods)
    - Khối static (static blocks)
    - Lớp static (static class)

- Final: Khi một biến được khai báo là "final", giá trị của biến đó không thể thay đổi sau khi đã được gán một lần. Điều này có nghĩa là biến final chỉ có thể được gán giá trị một lần và sau đó không thể thay đổi nữa.


```java
public class MathUtils {
    public static final double PI = 3.14159;  // Biến static final - hằng số PI
    public static int counter = 0;           // Biến static đếm số lượng thể hiện đã được tạo
    
    public MathUtils() {
        counter++;
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.PI);     // Truy cập biến static final PI thông qua tên lớp
        System.out.println(MathUtils.add(5, 3));  // Gọi phương thức static add
        System.out.println(MathUtils.counter);    // Truy cập biến static counter
        
        MathUtils utils1 = new MathUtils();
        MathUtils utils2 = new MathUtils();
        System.out.println(MathUtils.counter);    // In ra số lượng thể hiện đã được tạo
    }
}

```

- Biến static: được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objects (hoặc instances ) của lớp đó và điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn

```java
public class Counter {
    private static int count = 0; 
 
    public Counter() {
         
    }
     
    public void visit() {
        count++;
        this.print();
    }
     
    public void print() {
        System.out.println("count = " + count);     
    }
 
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.visit();
        Counter c2 = new Counter();
        c2.visit();
        Counter c3 = new Counter();
        c3.visit();
    }
}
```

- Đặc điểm phương thức static: 
    - Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
    - Một phương thức static có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
    - Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
    - Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
    - Một phương thức static không thể được sử dụng từ khóa this và super.
    - Người dùng không thể override (đè) phương thức static trong Java

- Khi nào cần dùng phương thức static:
    - Khi phương thức không phụ thuộc vào trạng thái của đối tượng, nghĩa là không cần sử dụng bất kỳ dữ liệu thành viên nào của đối tượng, mọi thứ được truyền như các tham số (parameter).
    - Các phương thức tiện ích là một trường hợp thường được sử dụng nhất trong Java vì chúng có thể được truy cập trực tiếp bằng tên lớp mà không cần tạo bất thể hiện nào. Lớp java.lang.Math là một ví dụ trường hợp sử dụng static method.

- Đặc điểm của khối static:
    - Khối static được dùng để khởi tạo hoặc thay đổi giá trị của các biến static.
    - Nó được thực thi trước phương thức main tại thời gian tải lớp.
    - Một class có thể có nhiều static blocks.

```java
public class Test {
     
    private static String subject;
     
    static {
        System.out.println("Khối static được gọi");
    }
     
    static {
        subject = "Khối static (static blocks)";
    }
     
    Test () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }
     
    public static void main(String[] args) {
        Test ex1 = new Test();
    }
}

```

- Đặc điểm của lớp static: Một class được có thể được đặt là static chỉ khi nó là một nested class (tức nằm trong một lớp khác). Một nested static class có thể được truy cập mà không cần một object của outer class (lớp bên ngoài).

```java
public class Test1 {
    private String subject;
     
    Test1 (String subject) {
        this.subject = subject;
    }
     
    // nested static class
    static class Test2 {
        public static String WEBSITE = "hit.haui.com";
    }
     
    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + Test2.WEBSITE);
    }
     
    public static void main(String[] args) {
        Test1 ex1 = new Test1("Core Java");
        ex1.print();
    }
```

## 2. Mảng đối tượng

- Mảng đối tượng trong java cho phép khởi tạo và lưu trữ 1 danh sáhc gồm nhiều đối tượng của 1 lớp.


``` java


public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class School {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Tạo mảng chứa các đối tượng Student
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        
        for (Student student : students) {
            System.out.println("Student name: " + student.getName());
        }
    }
}
```

## 3. Tính đa hình 
- Tính đa hình (Polymorphism) là một khía cạnh quan trọng trong Lập Trình Hướng Đối Tượng (OOP). Nó cho phép bạn thực hiện cùng một hành động trên các đối tượng khác nhau mà không cần quan tâm đến loại đối tượng cụ thể. Chúng ta sẽ tìm hiểu về tính đa hình thông qua ví dụ thực tế và sử dụng Java để minh họa.
- Tại sao cần tính đa hình?
Tính đa hình giúp tạo ra mã nguồn linh hoạt và dễ bảo trì. Nó cho phép bạn viết các phương thức chung mà có thể được sử dụng trên nhiều lớp khác nhau, giúp giảm sự lặp lại mã và tạo ra mã nguồn dễ mở rộng.

Ví dụ với Java
Hãy xem xét ví dụ về tính đa hình trong Java sử dụng lớp cha "Hình" và các lớp con "Hình Tròn" và "Hình Vuông."

``` java
// Lớp cha "Hình"
class Shape {
    void draw() {
        System.out.println("Vẽ hình...");
    }
}

// Lớp con "Hình Tròn"
class Circle extends Shape {
    void draw() {
        System.out.println("Vẽ hình tròn...");
    }
}

// Lớp con "Hình Vuông"
class Square extends Shape {
    void draw() {
        System.out.println("Vẽ hình vuông...");
    }
}
```

Trong ví dụ này, lớp cha "Hình" có một phương thức draw mà các lớp con "Hình Tròn" và "Hình Vuông" ghi đè (override). Điều này có nghĩa là mỗi lớp con có cùng tên phương thức draw, nhưng chúng thực hiện hành động riêng biệt.

## 4. Tính đóng gói
Tính đóng gói (Encapsulation) là một trong những nguyên tắc quan trọng trong Lập Trình Hướng Đối Tượng (OOP). Nguyên tắc này đề cập đến việc che giấu thông tin và hành vi bên trong đối tượng, chỉ tiết lộ những gì cần thiết và quy định cách truy cập thông qua các phương thức công khai. Chúng ta sẽ tìm hiểu về tính đóng gói thông qua ví dụ thực tế và sử dụng Java để minh họa.

Tại sao cần tính đóng gói?
Trong lập trình, tính đóng gói giúp bảo vệ dữ liệu và tránh truy cập trực tiếp đến các thuộc tính của đối tượng từ bên ngoài. Điều này có ích trong việc quản lý và bảo vệ dữ liệu, đồng thời cho phép kiểm soát cách các thành phần khác nhau tương tác với đối tượng đó.

``` java
public class Person {
    private String name;  // Thuộc tính name là private
    private int age;      // Thuộc tính age là private

    // Phương thức khởi tạo
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức công khai để lấy tên
    public String getName() {
        return name;
    }

    // Phương thức công khai để lấy tuổi
    public int getAge() {
        return age;
    }

    // Phương thức công khai để thay đổi tuổi
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

Trong ví dụ này, thuộc tính name và age được khai báo là private, nghĩa là chúng không thể truy cập trực tiếp từ bên ngoài lớp Person. Để lấy hoặc thay đổi giá trị của chúng, chúng ta sử dụng các phương thức công khai getName, getAge, và setAge.