package nguyenhuyhoang_20226008678;

import java.util.List;

public interface IInteriorManager {
    boolean addInterior(Interior i);   // Thêm sản phẩm vào kho
    boolean editInterior(Interior i);  // Sửa thông tin sản phẩm
    boolean delInterior(Interior i);   // Xóa sản phẩm khỏi kho
    List<Interior> searchInterior(String name);  // Tìm kiếm sản phẩm theo tên
    List<Interior> sortedInterior(double price); // Sắp xếp theo giá
}


