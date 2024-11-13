package nguyenhuyhoang_20226008678;

public abstract class Product {
    private String product_id;
    private String product_name;
    private double product_price;
    private int product_total;

    // Constructor không tham số
    public Product() {
    }

    public Product(String product_id, String product_name, double product_price, int product_total) {
  		super();
  		this.product_id = product_id;
  		this.product_name = product_name;
  		this.product_price = product_price;
  		this.product_total = product_total;
  	}
    

    // Getter và Setter
    public String getProductId() {
        return product_id;
    }

  

	public void setProductId(String product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public double getProductPrice() {
        return product_price;
    }

    // Setter cho giá sản phẩm
    public void setProductPrice(double product_price) {
        if (product_price < 0) {
            throw new IllegalArgumentException("Giá sản phẩm không thể âm.");
        }
        this.product_price = product_price;
    }

    public int getProductTotal() {
        return product_total;
    }

    // Setter cho số lượng sản phẩm
    public void setProductTotal(int product_total) {
        if (product_total < 0) {
            throw new IllegalArgumentException("Số lượng sản phẩm không thể âm.");
        }
        this.product_total = product_total;
    }


    // Phương thức toString()
    @Override
    public String toString() {
        return "Product [ID=" + product_id + ", Name=" + product_name + ", Price=" + product_price + ", Total=" + product_total + "]";
    }
}

	
	
	
	
	
	
	

