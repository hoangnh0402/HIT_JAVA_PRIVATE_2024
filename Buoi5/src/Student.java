public class Student extends Person{
    private String schoolName;
    private double point;


    public Student() {
    }

    public Student(String id, int age, Address address, String schoolName, double point) {
        super(id, age, address);
        this.schoolName = schoolName;
        this.point = point;
    }

    public Student(double point, String schoolName) {
        this.point = point;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "schoolName='" + schoolName + '\'' +
                ", point=" + point +
                '}';
    }


    @Override
    public void display(){
        //this.display();
        System.out.println(toString());
    }
}
