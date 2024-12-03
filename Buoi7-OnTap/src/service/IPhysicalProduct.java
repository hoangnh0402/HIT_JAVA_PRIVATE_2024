package service;

import model.PhysicalProduct;

import java.util.List;
import java.util.Scanner;

public interface IPhysicalProduct {
    public boolean addProduct(Scanner scanner) throws Exception;
    public boolean editProduct(Scanner scanner);
    public boolean deleteProduct(String id);
    public void getAllProduct();
    public List<PhysicalProduct> searchByName(String name);
}
