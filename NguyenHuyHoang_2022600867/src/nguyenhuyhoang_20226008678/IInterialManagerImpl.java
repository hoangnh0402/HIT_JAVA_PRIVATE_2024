package nguyenhuyhoang_20226008678;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class IInterialManagerImpl implements IInteriorManager {
    private List<Interior> inventory; 

    // Constructor
    public IInterialManagerImpl() {
        inventory = new ArrayList<>();
    }

    @Override
    public boolean addInterior(Interior i) {
        return inventory.add(i);
    }

    @Override
    public boolean editInterior(Interior i) {
        for (int j = 0; j < inventory.size(); j++) {
            if (inventory.get(j).getProductId().equals(i.getProductId())) {
                inventory.set(j, i);  // Sửa thông tin sản phẩm
                return true;
            }
        }
        return false;  // Không tìm thấy sản phẩm
    }

    @Override
    public boolean delInterior(Interior i) {
        return inventory.remove(i);
    }

    @Override
    public List<Interior> searchInterior(String name) {
        List<Interior> result = new ArrayList<>();
        for (Interior product : inventory) {
            if (product.getProductName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public List<Interior> sortedInterior(double price) {
        List<Interior> sortedList = new ArrayList<>(inventory);
        sortedList.sort(Comparator.comparingDouble(Interior::getProductPrice));  // Sắp xếp theo giá
        return sortedList;
    }
    // cho ae dam me thuat toan
//    public static void bubbleSortByPrice(List<Product> products) {
//        int n = products.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                // So sánh giá của hai sản phẩm kế tiếp
//                if (products.get(j).getPrice() > products.get(j + 1).getPrice()) {
//                    // Đổi chỗ hai sản phẩm nếu giá trị của sản phẩm trước lớn hơn
//                    Product temp = products.get(j);
//                    products.set(j, products.get(j + 1));
//                    products.set(j + 1, temp);
//                }
//            }
//        }
//    }
}

