package service.impl;

import model.Role;
import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
    private ArrayList<User> userList  = new ArrayList<>();
    private User currentUser;

    public IUserServiceImpl(){
        userList.add(new User("001", "Admin", "a@gmail.com", "admin", 18, "2004-02-04", Role.AMIN));
        currentUser = null;
    }

    @Override
    public void login(Scanner scanner){
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for(User user : userList){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                currentUser = user;
                System.out.println("Login successfully!");
                return;
            }
        }

        System.out.println("Invalid email or password!");
    }

    @Override
    public void logout(){
        if(currentUser != null) {
            System.out.println("Logout successfully!");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in!");
        }
    }

    @Override
    public void display() {
        if(userList.isEmpty()) {
            System.out.println("No member found!");
        } else{
            System.out.println("Member List: ");
            for(User user: userList){
                user.display();
            }
        }

    }

    private  boolean isAdmin(){
//        if(currentUser != null && currentUser.getRole() == Role.AMIN) {
//            return true;
//        }
//        return false;
        return currentUser != null && currentUser.getRole() == Role.AMIN;
    }

    @Override
    public boolean addMember(User user) {
        if(isAdmin()) {
            userList.add(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteMember(String id) {
        if(isAdmin()) {
            userList.remove(id);
            return true;
        }
        return false;
    }
}
