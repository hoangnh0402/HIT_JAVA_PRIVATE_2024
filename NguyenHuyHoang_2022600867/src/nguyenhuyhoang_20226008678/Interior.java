package nguyenhuyhoang_20226008678;

public class Interior extends Product {
    private String material;  // Chất liệu
    private double size;      // Kích thước

    // Constructor không tham số
    public Interior() {
        super();
        this.material = "";
        this.size = 0.0;
    }

    // Constructor đủ tham số
    public Interior(String product_id, String product_name, double product_price, int product_total, String material, double size) {
        super(product_id, product_name, product_price, product_total);
        this.material = material;
        this.size = size;
    }

    // Getter và Setter cho các thuộc tính riêng
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

	@Override
	public String toString() {
		return "Interior [material=" + material + ", size=" + size + "]";
	}


  
}

