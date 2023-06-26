package LogicHandle;

import java.util.Scanner;

public class MenuLogicManagement {
    private ItemsLogicManagement itemsLogicManagement = new ItemsLogicManagement();
    private SalerLogicManagement salerLogicManagement = new SalerLogicManagement();
    private SaleListManagement saleListManagement = new SaleListManagement(salerLogicManagement, itemsLogicManagement);
    public void menu() {
        while (true) {
            showMenuContent();
            int choice = functionChoice();
            switch (choice) {
                case 1:
itemsLogicManagement.inputNewItem();
                    break;
                case 2:
itemsLogicManagement.showItem();
                    break;
                case 3:
salerLogicManagement.inputNewSaler();
                    break;
                case 4:
salerLogicManagement.showSaler();
                    break;
                case 5:
                    saleListManagement.inputNewSaleList();
                    break;
                case 6:
saleListManagement.showSaleList();
                    break;
                case 7:
saleListManagement.sortSaler();
                    break;
                case 8:
saleListManagement.sortItems();
                    break;
                case 9:
saleListManagement.calculateSalary();
                    break;
                case 10:
                    return;
            }
        }
    }
    private int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 10) {
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        } while (true);
        return choice;
    }


    private void showMenuContent() {
        System.out.println("=============PHẦN MỀM QUẢN LÝ BÁN HÀNG==============");
        System.out.println("1. Thêm mới mặt hàng.");
        System.out.println("2. In danh sách các mặt hàng đã có.");
        System.out.println("3. Thêm mới nhân viên.");
        System.out.println("4. In danh sách nhân viên.");
        System.out.println("5. Lập bảng danh sách bán hàng.");
        System.out.println("6. In bảng danh sách bán hàng.");
        System.out.println("7. Sắp xếp bảng danh sách bán hàng theo tên nhân viên.");
        System.out.println("8. Sắp xếp bảng danh sách bán hàng theo nhóm mặt hàng.");
        System.out.println("9. Lập bảng kê doanh thu cho mỗi nhân viên.");
        System.out.println("10. Thoát.");
        System.out.println("Chọn yêu cầu: ");
    }
}
