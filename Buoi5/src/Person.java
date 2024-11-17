public class Person {
    private String id;
    private int age;
    private Address address;// Bac Tu Liem - Nhon - Ha Noi

    public Person() {
    }

    public Person(String id, int age, Address address) {
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
