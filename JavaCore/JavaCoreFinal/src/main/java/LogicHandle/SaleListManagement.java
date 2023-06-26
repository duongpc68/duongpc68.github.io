package LogicHandle;

import Entity.Items;
import Entity.SaleListDetails;
import Entity.Saler;
import Entity.SalesList;

import java.util.Scanner;

public class SaleListManagement {
    private final SalesList[] saleListManagement = new SalesList[100];
    private SalerLogicManagement salerLogicManagement;
    private ItemsLogicManagement itemsLogicManagement;

    public SaleListManagement(SalerLogicManagement salerLogicManagement, ItemsLogicManagement itemsLogicManagement) {
        this.salerLogicManagement = salerLogicManagement;
        this.itemsLogicManagement = itemsLogicManagement;
    }

    public void inputNewSaleList() {
        if (!salerLogicManagement.salerIsNotEmpty() || !itemsLogicManagement.itemIsNotEmpty()) {
            System.out.println("Không có dữ liệu về nhân viên hoặc mặt hàng, vui lòng tạo đủ dữ liệu!");
            return;
        }
        System.out.println("Nhập số nhân viên bạn muốn lập bảng: ");
        int salerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < salerNumber; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ" + (i + 1) + "muốn lập bảng");
            System.out.println("Nhập ID nhân viên: ");
            int salerId;
            Saler saler = null;
            do {
                salerId = new Scanner(System.in).nextInt();
                for (int j = 0; j < salerLogicManagement.getSalers().length; j++) {
                    if (salerLogicManagement.getSalers()[j] != null && salerLogicManagement.getSalers()[j].getSaleId() == salerId) {
                        saler = salerLogicManagement.getSalers()[j];
                        break;
                    }
                }
                if (saler != null) {
                    break;
                }
                System.out.println("Không tồn tại ID nhân viên vừa nhập, xin vui lòng nhập lại: ");
            } while (true);
            System.out.println("Nhân viên này bán được mặt hàng nào: ");
            int itemNumber = new Scanner(System.in).nextInt();
            SaleListDetails[] details = new SaleListDetails[itemNumber];
            int count = 0;
            for (int j = 0; j < itemNumber; j++) {
                System.out.println("Mặt hàng thứ " + (j + 1) + " mà nhân viên này đã bán là gì: ");
                int itemId;
                Items item = null;
                do {
                    itemId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < itemsLogicManagement.getItems().length; k++) {
                        if (itemsLogicManagement.getItems()[k] != null && itemsLogicManagement.getItems()[k].getItemId() == itemId) {
                            item = itemsLogicManagement.getItems()[k];
                            break;
                        }
                    }
                    if (item != null) {
                        break;
                    }
                    System.out.println("Không tồn tại mặt hàng có ID vừa nhập, vui lòng nhập lại: ");
                } while (true);
                System.out.println("Nhân viên này đã bán được bao nhiêu: ");
                int numberItem = new Scanner(System.in).nextInt();
                do {
                    numberItem = new Scanner(System.in).nextInt();
                    if (numberItem < 1 || numberItem > 5) {
                        System.out.println("Một nhân viên chỉ được phép bán tối đa 5 mặt hàng");
                        continue;
                    }
                    break;
                }
                while (true);
                SaleListDetails saleListDetails = new SaleListDetails(saler, numberItem);
                details[count] = saleListDetails;
                count++;
            }
            SalesList salesList = new SalesList(saler, details);
            saveSaleList(salesList);
        }
    }

    public void saveSaleList(SalesList salesList) {
        for (int i = 0; i < saleListManagement.length; i++) {
            if (saleListManagement[i] == null) {
                saleListManagement[i] = salesList;
                break;
            }
        }
    }

    public void showSaleList(SaleListManagement saleListManagements) {
        for (int i = 0; i < saleListManagement.length; i++) {
            if (saleListManagement[i] != null) {
                System.out.println(saleListManagement[i]);
            }
        }
    }

    public void calculateSalary() {
        for (int i = 0; i < saleListManagement.length; i++) {
            SalesList saleListManagements = saleListManagement[i];
            if (saleListManagements == null) {
                continue;
            }
            Saler saler = saleListManagements.getSaler();
            double salary = 0;
            SaleListDetails[] details = saleListManagements.getDetails();
            for (int j = 0; j < details.length; j++) {
                Items items = details[i].getItems();
                salary += (items.getPrice() * details[i].getItemQuantity());
            }
            System.out.println("Lương của giảng viên " + saler.getName() + " là  " + salary);
        }
    }

    public void showSaleList() {
    }

public void sortSaler() {
        for (int i = 0; i < saleListManagement.length - 1; i++) {
            for (int j = 0; j < saleListManagement.length - i - 1; j++) {
                if (saleListManagement[j].compareTo(saleListManagement[j + 1]) > 0) {
                    SalesList temp = saleListManagement[j];
                    saleListManagement[j] = saleListManagement[j + 1];
                    saleListManagement[j + 1] = temp;
                }
            }
        }
    }
    public void sortItems(){
        for (int i = 0; i < saleListManagement.length - 1; i++) {
            for (int j = 0; j < saleListManagement.length - i - 1; j++) {
                if (saleListManagement[j].compareTo(saleListManagement[j + 1]) > 0) {
                    SalesList temp = saleListManagement[j];
                    saleListManagement[j] = saleListManagement[j + 1];
                    saleListManagement[j + 1] = temp;
                }
            }
        }
    }
}

