import java.util.Arrays;

public class Main2 {

    final int x;

    public Main2(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        // int, float(7 chu so sau dau cham dong "."), double (15 chu so sau dau cham dong), char, boolean
        int[] arr = new int[10];
        Person[] personList = new Person[10];
//        Person[0] = new Person();
//        //1,2,3,.....
//        Person[9] = new Person();

        for(Person person : personList) {
            person.getTen().equals("Hoang"); // hoang
            person.getTen().equalsIgnoreCase("Hoang");
        }




        Person p = new Person();
        Person p2 = new Person("T01", "Hoang", 18, "Phu Tho", "01223");
    }
}
