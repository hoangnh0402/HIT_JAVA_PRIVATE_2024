package nguyenhuyhoang_20226008678;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Interior chair = new Interior("P001", "Chair", 100.0, 10, "Wood", 1.5);
        Interior table = new Interior("P002", "Table", 200.0, 5, "Metal", 3.0);
        Interior lamp = new Interior("P003", "Lamp", 50.0, 20, "Plastic", 0.8);

        // Tạo đối tượng InteriorManagerImpl để quản lý kho
        IInteriorManager manager = new IInterialManagerImpl();

        // Thêm sản phẩm vào kho
        manager.addInterior(chair);
        manager.addInterior(table);
        manager.addInterior(lamp);

        // Tìm kiếm sản phẩm theo tên
        List<Interior> foundProducts = manager.searchInterior("Table");
        System.out.println("Sản phẩm tìm thấy: " + foundProducts);

        // Sửa thông tin sản phẩm
        table.setProductPrice(220.0);  // Cập nhật giá
        manager.editInterior(table);

        // Hiển thị sản phẩm sau khi sửa
        System.out.println("Sản phẩm sau khi sửa: " + table);

        // Sắp xếp sản phẩm theo giá
        List<Interior> sortedProducts = manager.sortedInterior(0);
        System.out.println("Sản phẩm sau khi sắp xếp theo giá: " + sortedProducts);

        // Xóa sản phẩm khỏi kho
        manager.delInterior(lamp);
        System.out.println("Sản phẩm sau khi xóa: " + lamp);
    }
}

