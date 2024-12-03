package model;

public class PhysicalProduct extends Product{
    public PhysicalProduct(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public double totalPrice(){
        return this.getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + "Total Price: " + totalPrice();
    }

    public void display(){
        System.out.println(toString());
    }
}
