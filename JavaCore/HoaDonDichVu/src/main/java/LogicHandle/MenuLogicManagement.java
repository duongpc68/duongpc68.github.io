package LogicHandle;

import java.util.Scanner;

public class MenuLogicManagement {
    private final CustomerLogicManagement customerLogicManagement = new CustomerLogicManagement();
    private final ServiceLogicManagement serviceLogicManagement = new ServiceLogicManagement();
    private final BillLogicManagement billLogicManagement = new BillLogicManagement();

    public void menu() {
        while (true) {
            showMenuContent();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    CustomerLogicManagement.inputNewCustomer();
                    break;
                case 2:
                    CustomerLogicManagement.showCustomer();
                    break;
                case 3:
                    serviceLogicManagement.inputNewService();
                    break;
                case 4:
                    serviceLogicManagement.showService();
                    break;
                case 5:
billLogicManagement.inputNewBill();
                    break;
                case 6:

                    break;
                case 7:
                    BillLogicManagement.sortByName();
                    break;
                case 8:

                    break;
                case 9:

                 break;
                case 10:
                    return;
            }
        }
    }
    private static void showMenuContent() {
        System.out.println("=============PHẦN MỀM QUẢN LÝ HÓA ĐƠN SỬ DỤNG DỊCH VỤ==============");
        System.out.println("1. Thêm mới danh sách khách hàng.");
        System.out.println("2. In danh sách khách hàng.");
        System.out.println("3. Thêm mới dịch vụ.");
        System.out.println("4. In danh sách dịch vụ.");
        System.out.println("5. Lập hóa đơn cho mỗi khách hàng đã có.");
        System.out.println("6. In danh sách hóa đơn.");
        System.out.println("7. Sắp xếp hóa đơn theo họ và tên khách hàng.");
        System.out.println("8. Sắp xếp hóa đơn theo số lượng sử dụng(giảm dần).");
        System.out.println("9. Lập bảng kê số tiền phải trả cho mỗi khách hàng.");
        System.out.println("10. Thoát chương trình.");
        System.out.println("Chọn một yêu cầu bạn muốn: ");
    }
    private static int functionChoice() {
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
}
