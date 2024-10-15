import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Nhập độ dài cạnh thứ nhất (a): ");
        a = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh thứ hai (b): ");
        b = scanner.nextInt();

        System.out.print("Nhập độ dài cạnh thứ ba (c): ");
        c = scanner.nextInt();
        
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là độ dài 3 cạnh của một tam giác.");
            } else {
                System.out.println("Ba số " + a + ", " + b + ", " + c + " KHÔNG phải là độ dài 3 cạnh của một tam giác.");
            }
        } else {
            System.out.println("Các cạnh của tam giác phải là số dương.");
        }

        scanner.close();
    }
}
