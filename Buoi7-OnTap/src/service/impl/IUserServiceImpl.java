package service.impl;

import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
    List<User> userList = new ArrayList<>();
    private User currentUser;

    public IUserServiceImpl(){
        currentUser = null;
    }
    @Override
    public boolean login(Scanner scanner) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
