# Buổi 6

## Abstract class và Interface trong Java OOP

Interface:
1. Định nghĩa: Giao diện (Interface) là một khái niệm trong lập trình hướng đối tượng (OOP) cho phép bạn định nghĩa một tập hợp các phương thức trừu tượng (abstract methods) mà các lớp khác phải triển khai. Nó chỉ định giao diện (contracts) mà các lớp khác phải tuân theo, nhưng không cung cấp bất kỳ triển khai cụ thể nào.
2. Sử dụng: 

       • Giao diện (Interface) là một khái niệm trong Java cho phép định nghĩa các phương thức mà các lớp khác phải triển khai. 
       
       • Giao diện chỉ định giao tiếp mà các lớp con phải tuân theo, nhưng không cung cấp triển khai cụ thể. 	
       
       • Một lớp có thể triển khai nhiều giao diện, cho phép đa kế thừa (multiple inheritance) cho các phương thức giao diện. 

       • Ví dụ: Giao diện Runnable định nghĩa phương thức run(), và các lớp khác (ví dụ: Thread) triển khai phương thức này theo cách riêng.

```java
// Định nghĩa một giao diện Speakable
interface Speakable {
    void speak();
}

// Lớp Dog triển khai giao diện Speakable
class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
```


Abstract Class:
1. Định nghĩa: Lớp trừu tượng (Abstract Class) là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó có thể chứa phương thức trừu tượng (abstract methods) cũng như phương thức không trừu tượng (concrete methods) và thuộc tính.
2. Sử dụng:

- Lớp trừu tượng (Abstract Class) là một lớp mà không thể tạo một đối tượng cụ thể từ nó. 

- Lớp trừu tượng có thể chứa các phương thức trừu tượng (abstract methods) và các phương thức không trừu tượng (concrete methods) cùng với các thuộc tính. 

- Một lớp con kế thừa từ lớp trừu tượng phải triển khai tất cả các phương thức trừu tượng. 

- Một lớp con có thể kế thừa từ một lớp trừu tượng và triển khai giao diện cùng lúc. 

- Ví dụ: Lớp trừu tượng Shape có phương thức trừu tượng calculateArea(), và các lớp con (ví dụ: Circle, Rectangle) triển khai phương thức này theo cách riêng.


```java
// Lớp trừu tượng Animal
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng speak
    public abstract void speak();

    // Phương thức không trừu tượng
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Lớp Dog kế thừa từ lớp trừu tượng Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}
```

- So sánh Interface và Abstract Class: 
    - Đa kế thừa: Interface cho phép một lớp triển khai nhiều giao diện, trong khi một lớp chỉ có thể kế thừa từ một lớp trừu tượng. Điều này cho phép tính đa kế thừa (multiple inheritance) trong trường hợp của giao diện. 

    - Triển khai: Giao diện chỉ định các phương thức trừu tượng mà lớp con phải triển khai, trong khi lớp trừu tượng có thể cung cấp một phần triển khai cơ bản của các phương thức. 

    - Sự linh hoạt: Lớp trừu tượng cung cấp sự linh hoạt hơn vì bạn có thể triển khai phần nào đó của một phương thức và để phần khác là trừu tượng. Giao diện không cung cấp tính năng này. 

    - Mục đích: Sử dụng giao diện khi bạn muốn định nghĩa một hợp đồng giao tiếp cho các lớp không có sự kế thừa chung. Sử dụng lớp trừu tượng khi bạn muốn chia sẻ mã nguồn chung cho các lớp con và định nghĩa các phương thức cơ bản.



## Tính trừu tượng và đa hình trong Java OOP

Tài liệu đọc thêm:
- [Trừu tượng](https://freetuts.net/tinh-truu-tuong-abstraction-trong-java-1138.html)
- [Đa hình](https://viettuts.vn/java/tinh-da-hinh-trong-java)

1.Trừu tượng (Abstraction) 
- Tính trừu tượng là một khái niệm trong lập trình hướng đối tượng (OOP) cho phép bạn ẩn đi các chi tiết phức tạp của một đối tượng và chỉ tập trung vào các tính chất hoặc hành vi quan trọng. Mục tiêu chính của tính trừu tượng là đơn giản hóa việc sử dụng đối tượng và giảm độ phức tạp của mã nguồn.

Các cách để thực hiện tính trừu tượng bao gồm:
- Giao diện (Interface): Một giao diện là một tập hợp các phương thức mà các lớp khác phải triển khai. Nó chỉ định "các giao diện" của một đối tượng mà không quan tâm đến cách nó được triển khai. Điều này giúp loại bỏ các chi tiết cụ thể của một đối tượng và chỉ quan tâm đến cách sử dụng nó.

- Lớp trừu tượng (Abstract class): Một lớp trừu tượng là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó thường chứa một số phương thức trừu tượng (có thể hoặc không được triển khai trong các lớp con) và các thuộc tính chung cho các lớp con. Lớp trừu tượng cung cấp một cơ chế để định nghĩa các phương thức cơ bản mà các lớp con cần triển khai.



Giao diện(Interface)

```java
// Định nghĩa một giao diện Speakable
public interface Speakable {
    void speak();
}

// Lớp Dog triển khai giao diện Speakable
public class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

// Lớp Cat triển khai giao diện Speakable
public class Cat implements Speakable {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

public class KiemTra.Bai2.Main {
    public static void main(String[] args) {
        Speakable dog = new Dog();
        Speakable cat = new Cat();

        dog.speak(); // Output: Woof!
        cat.speak(); // Output: Meow!
    }
}
```

Trong ví dụ trên, Speakable là giao diện định nghĩa một phương thức speak, và Animal là lớp trừu tượng chứa một trường name và định nghĩa một phương thức trừu tượng speak. Các lớp con Dog và Cat triển khai phương thức speak theo cách của riêng họ.

2. Đa hình(Polymorphism):

- Đa hình là khả năng của các đối tượng của các lớp khác nhau để đáp ứng một phương thức cụ thể theo cách riêng của họ.

Lớp trừu tượng (Abstract class): 
Lớp trừu tượng trong Java là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó thường chứa một hoặc nhiều phương thức trừu tượng và có thể có phương thức không trừu tượng. Dưới đây là ví dụ:

```java
// Lớp trừu tượng Animal
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng speak
    public abstract void speak();
}

// Lớp Dog kế thừa từ lớp trừu tượng Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}

// Lớp Cat kế thừa từ lớp trừu tượng Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}

public class KiemTra.Bai2.Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.speak(); // Output: Buddy says Woof!
        cat.speak(); // Output: Whiskers says Meow!
    }
} 
```

Trong ví dụ này, Animal là lớp trừu tượng với một phương thức trừu tượng speak. Dog và Cat là các lớp con kế thừa từ Animal và triển khai phương thức speak theo cách của riêng họ. Trong hàm main, chúng ta tạo đối tượng Dog và Cat thông qua lớp cơ sở Animal, và sau đó gọi phương thức speak để in ra tiếng kêu của chúng.

## Upcasting và downcasting trong java
![alt-text](https://codelearnstorage.s3.amazonaws.com/Media/Default/Users/linhdk13_40fpt_2Ecom/linhdk13/865161-1.png)

- Khi biến của lớp cha tham chiếu tới đối tượng của lớp con (đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha), thì đó được gọi là up-casting

```java
class Animal {
	public void sound() {
		System.out.println("some sound");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("woof woof");
	}
}

public class Entry {
	public static void main(String[] args) {
		// Up-casting
		Animal animal1 = new Cat();
		animal1.sound();
		// Up-casting
		Animal animal2 = new Dog();
		animal2.sound();
	}
}
```

- Lưu ý: khi biến của lớp cha tham chiếu tới đối tượng của lớp con thì biến này chỉ có thể gọi tới các thuộc tính và phương thức có ở lớp cha và nếu lớp con ghi đè thì phương thức được gọi sẽ ở lớp con



## List, ArrayList trong Java OOP

![alt text](https://ironhackvietnam.edu.vn/wp-content/uploads/2021/03/list-trong-java.jpg)

- List trong Java là 1 interface nằm trong những Java Collection thường được sử dụng để lưu trữ và thao tác với 1 mảng các đối tượng. (tìm kiếm, chèn, sửa, xóa, ...). Tìm hiểu thêm về [Collections](https://viblo.asia/p/tong-quan-ve-collections-trong-java-maGK7E0Dlj2)
- Trong đó có ArrayList được triển khai từ interface List, sử dụng như 1 mảng động trong Java để lưu trữ phần tử, hỗ trợ nhiều phương thức để thao tác với mảng

- Khai báo 1 ArrayList:

```java
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        ArrayList<VD.Person> array2 = new ArrayList<VD.Person>();
    }
```

- Lưu ý:

  - Kiểu dữ liệu truyền vào phải là 1 lớp hoặc 1 wrapper class: Integer, String, Double, ...
  - ArrayList là 1 class nên nó sẽ có những phương thức riêng để thao tác với mảng được tạo ra

- Các phương thức quan trọng của ArrayList:
  - add, addAll
  - contains
  - retainAll, removeAll
  - indexOf, lastIndexOf
  - size, get, set
  - [Xemthêm](https://viettuts.vn/java-collection/arraylist-trong-java#goto-h2-1)

```java
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        // Thêm phần tử vào dãy: add và addAll
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(5);
        // array1: 1, 2, 3, 5

        array1.add(1, 4); // add theo chỉ số (index)
        // array1: 1, 4, 2, 3, 5

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(5);
        array2.add(6);
        // array2: 5, 6

        array1.addAll(array2); // add ArrayList vào ArrayList khác
        // array1: 1, 4, 2, 3, 5, 5, 6

        // Kiểm tra phẩn tử có trong dãy hay không (true hoặc false): contains
        boolean checkNumber = array1.contains(5); // => true

        // Phương thức array1.retainAll(array2): xóa những phần tử không thuộc
        // array2 khỏi array1
        // array1: 1, 4, 2, 3, 5, 5, 6
        // array2: 5, 6
        array1.retainAll(array2);
        // array1: 5, 5, 6
        // array2: 5, 6

        // Phương thức array1.removeAll(array2): ngược lại, xóa những phần tử
        // thuộc array2 khỏi array1
        array1.removeAll(array2);
        // array1: (NOTHING)
        // array2: 5, 6

        // Phương thức lấy vị trí của phần tử dãy
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(1);
        array3.add(2);
        array3.add(3);
        array3.add(1);
        array3.add(4);

        int idx1 = array3.indexOf(1);
        int idx2 = array3.lastIndexOf(1);
        int idx3 = array3.indexOf(5);

        // Các phương thức thông dụng khác để truy xuất đến phần tử trong dãy
        for(int i = 0 ; i < array3.size() ; i++){
            array3.set(i, 100);
            System.out.print(array3.get(i) + " ");
        }

    }
```
