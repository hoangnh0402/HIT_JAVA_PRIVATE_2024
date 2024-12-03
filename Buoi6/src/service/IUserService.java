package service;

import model.User;

import java.util.Scanner;

public interface IUserService {
    public void login(Scanner scanner) throws Exception;
    public void logout();
    public void display();
    public boolean addMember(User user); // admin use method
    public boolean deleteMember(String id); // admin use method
}
