## Kế thừa trong Java OOP (Inheritance)

- Kế thừa trong OOP là thừa hưởng lại thuộc tính và phương thức của 1 lớp
- Lớp cho kế thừa gọi là lớp cha, lớp được kế thừa gọi là lớp con, lớp con sẽ thừa hưởng các thuộc tính và phương thức của lớp cha mà vẫn phải đảm bảo tính đóng gói (Encapsulation)

![alt text](https://res.cloudinary.com/shopmanagement/image/upload/v1693349441/adtvjanovqgva5wagl5r.png)

![alt text](https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/inheritance6.png)

- Mục đích sử dụng kế thừa:
  - Tái sử dụng lại code
  - Dễ dàng chỉnh sửa, gỡ lỗi
  - Tăng khả năng mở rộng code
  - ...

```java
    class VD.Person{
        // private String name;
        protected String name;

        public VD.Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }

    // Lớp VD.Student kế thừa lớp VD.Person thông qua từ khóa extends
    class VD.Student extends VD.Person {
        private double gpa;

        // Khi khai báo constructor lớp con cần truyền đầy đủ tham số cả cha lẫn con
        public VD.Student(String name, double gpa) {
            // thông qua từ khóa super gọi đến constructor lớp cha
            super(name);
            this.gpa = gpa;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
```

- Lưu ý: Java không hỗ trợ đa kế thừa, mỗi class chỉ có 1 class cha duy nhất

![alt text](https://viettuts.vn/images/java/cac-kieu-ke-thua.jpg)

## Quan hệ HAS-A (Sở hữu một...)

- Quan hệ HAS-A xuất hiện khi một đối tượng chứa một thể hiện của một lớp khác như một thành viên của nó (Nó tương tự như kết tập trong c++ nếu bạn nào đã học OOP C++).

``` java

public class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println("Engine started");
    }
}

public class Car {
    private String brand;
    private Engine engine; // Quan hệ HAS-A với động cơ

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType);
    }
    
    public void startCar() {
        System.out.println("Starting the " + brand + " car");
        engine.start(); // Gọi phương thức của đối tượng động cơ
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Gasoline");
        car.startCar();
    }
}


```

## Ghi đè phương thức (override)

- Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.
- Sử dụng để cung cấp 1 phương thức được cài đặt khác đối với mỗi lớp con khác nhau của lớp cha.

```java
    class VD.Person{
        public void display() {
            System.out.println("This is VD.Person");
        }
    }

    class VD.Student extends VD.Person{
        @Override
        public void display() {
            System.out.println("This is VD.Student");
        }
    }

    class Test {
        public static void main(String[] args) {
            VD.Student s = new VD.Student();
            s.display();
            // This is VD.Student
        }
    }
```

- Ví dụ thực tế về ghi đè phương thức trong các ngân hàng:

![alt text](https://www.javatpoint.com/images/core/bankinheritance.png)

- Lưu ý:
  - Để ghi đè phương thức lớp cha thì phương thức lớp con cần có phạm vi truy cập bằng hoặc rộng hơn phương thức lớp cha: private -> default -> protected -> public
  - Phương thức static và final không thể bị ghi đè
## 2. Nạp chồng phương thức( Method Overloading)

- Nạp chồng phương thức cho phép bạn định nghĩa nhiều phương thức cùng tên trong cùng một lớp, nhưng có tham số khác nhau (kiểu tham số hoặc số lượng tham số).

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));       // Gọi phương thức int add(int a, int b)
        System.out.println(calculator.add(2.5, 3.5));   // Gọi phương thức double add(double a, double b)
    }
}
```

