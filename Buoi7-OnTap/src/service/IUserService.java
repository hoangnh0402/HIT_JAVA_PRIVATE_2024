package service;

import java.util.Scanner;

public interface IUserService {
    public boolean login(Scanner scanner);
    public boolean logout();
    public boolean isAdmin();
}
