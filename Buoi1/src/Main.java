import java.util.Scanner;

public class Main {

    // Hàm đệ quy tìm ƯCLN (GCD) bằng thuật toán Euclid
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    // Hàm đệ quy tìm BCNN (LCM) dựa vào ƯCLN
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y); //
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 số nguyên
        System.out.print("Nhập 3 số tự nhiên a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Tính ƯCLN của 3 số
        int gcd_ab = gcd(a, b);
        int gcd_abc = gcd(gcd_ab, c);

        // Tính BCNN của 3 số
        int lcm_ab = lcm(a, b);
        int lcm_abc = lcm(lcm_ab, c);

        // In kết quả
        System.out.println("BCNN của 3 số là: " + lcm_abc);
        System.out.println("ƯCLN của 3 số là: " + gcd_abc);

        scanner.close();

        /*
        Giả sử chúng ta có các bậc giá như sau:

            0 - 50 kWh: 1.500 VNĐ/kWh
            51 - 100 kWh: 2.000 VNĐ/kWh
            101 - 200 kWh: 2.500 VNĐ/kWh
            201 kWh trở lên: 3.000 VNĐ/kWh

            tính tổng tiền gia đình bạn phải trả khi sử dụng hết 305kWh.
         */
    }
}
