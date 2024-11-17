//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Cau Dien", "Ha Noi");
        Person p1 = new Person("001", 18, a1);
        //p1.setAddress("Phu Tho");
        Student s1 = new Student("002", 18, a1, "Haui", 0);
        s1.display();
    }
}