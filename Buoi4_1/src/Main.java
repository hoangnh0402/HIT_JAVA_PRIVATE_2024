import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng 5 phần tử từ lớp Person
        Person[] persons = new Person[5];
        persons[0] = new Person("123456789", "Nguyen Van A", 25, "Hà Nội", "0123456789");
        persons[1] = new Person("987654321", "Le Thi B", 30, "Đà Nẵng", "0987654321");
        persons[2] = new Person("123123123", "Tran Van C", 20, "Hải Phòng", "0909090909");
        persons[3] = new Person("321321321", "Pham Thi D", 35, "Huế", "0912121212");
        persons[4] = new Person("456456456", "Hoang Van E", 28, "Hà Nội", "0939393939");

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Tìm kiếm theo tên");
            System.out.println("2. Tìm kiếm theo mã CCCD");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) { //jump table
                case 1:
                    System.out.print("Nhập tên cần tìm: ");
                    String ten = scanner.nextLine();
                    timKiemTheoTen(persons, ten);
                    break;
                case 2:
                    System.out.print("Nhập mã CCCD cần tìm: ");
                    String maCanCuoc = scanner.nextLine();
                    timKiemTheoMaCCCD(persons, maCanCuoc);
                    break;
                case 3:
                    sapXepTheoTuoi(persons);
                    System.out.println("Danh sách sau khi sắp xếp theo tuổi:");
                    for (Person person : persons) {
                        person.display();
                        System.out.println("--------------------");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Tìm kiếm theo tên
    public static void timKiemTheoTen(Person[] persons, String ten) {
        boolean found = false;
        for (Person person : persons) {
            if (person.getTen().equalsIgnoreCase(ten)) {
                person.display();
                found = true;
                System.out.println("--------------------");
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có tên: " + ten);
        }
    }

    // Tìm kiếm theo mã CCCD
    public static void timKiemTheoMaCCCD(Person[] persons, String maCanCuoc) {
        boolean found = false;
        for (Person person : persons) {
            if (person.getMaCanCuocCongDan().equals(maCanCuoc)) {
                person.display();
                found = true;
                System.out.println("--------------------");
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có mã CCCD: " + maCanCuoc);
        }
    }

    // Sắp xếp theo tuổi
    public static void sapXepTheoTuoi(Person[] persons) {
        Arrays.sort(persons, (p1, p2) -> Integer.compare(p1.getTuoi(), p2.getTuoi()));
    }

}
