import model.Role;
import model.User;
import service.IUserService;
import service.impl.IUserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static common.Sort.BubleSort;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IUserService userService = new IUserServiceImpl();
        User PhamMinhKhuong = new User("007", "Pham Minh Khuong", "k@gmail.com", "1234", 18, "2005-01-01", Role.USER);
        while (true) {
            System.out.println("1.Login\n2.Display Member\n3.Add Member(Admin Only)\n4.Delete Member(Admin Only)\n5.Logout\n6.Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    userService.login(scanner);
                    break;
                case 2:
                    userService.display();
                    break;
                case 3:
                    //userService.addMember(PhamMinhKhuong);
                    if(userService.addMember(PhamMinhKhuong) == true) {
                        System.out.println("Add User Successfully!");
                    } else {
                        System.out.println("Add User NOT Successfully!");
                    }
                    break;
                case 4:
                    String id = scanner.nextLine();
                    //userService.deleteMember(id);
                    if (userService.deleteMember(id) == true) {
                        System.out.println("Delete User Successfully!");
                    } else {
                        System.out.println("Delete User NOT Successfully!");
                    }
                    break;
                case 5:
                    userService.logout();
                    break;
                case 6:
                    System.exit(0);
                    System.out.println("Exit!");
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    //phân biệt abstract class và interface
    // abstract class là ban trừu tượng nghĩa la nó truu tuong 50%
    // khong the khoi tao instance tu abstract class
    // interface là truu tuong hoan toan no dam bao cho chuong trinh cua minh tuan thu
    // hoan toan theo tinh truu tuong cua oop

}