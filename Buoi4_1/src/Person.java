public class Person {
    private String maCanCuocCongDan;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String soDienThoai;

    // Constructor
    public Person(String maCanCuocCongDan, String ten, int tuoi, String diaChi, String soDienThoai) {
        this.maCanCuocCongDan = maCanCuocCongDan;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public Person(){}

    // Getters and Setters
    public String getMaCanCuocCongDan() {
        return maCanCuocCongDan;
    }

    public void setMaCanCuocCongDan(String maCanCuocCongDan) {
        this.maCanCuocCongDan = maCanCuocCongDan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Person{" +
                "maCanCuocCongDan='" + maCanCuocCongDan + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    public void output(){
        System.out.println(toString());
    }

    public void input(){

    }

    // Display method
    public void display() {
        System.out.println("Mã CCCD: " + maCanCuocCongDan);
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }
}

