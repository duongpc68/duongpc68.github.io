package Entity;

import Statics.GoodsGroup;

import java.util.Scanner;

public class Items implements InputInfo {
    public int AUTO_ID = 1000;
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;
    private GoodsGroup itemType;

    public GoodsGroup getItemType() {
        return itemType;
    }

    public void setItemType(GoodsGroup itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", itemType=" + itemType +
                '}';
    }

    @Override
    public void inputInfo() {
        this.itemId = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhập tên mặt hàng: ");
        this.itemName = new Scanner(System.in).nextLine();
        System.out.println("Chọn nhóm mặt hàng: ");
        System.out.println("1. Điện Tử");
        System.out.println("2. Điện Lạnh");
        System.out.println("3. Máy Tính ");
        System.out.println("4. Thiết Bị Văn Phòng");
        int levelChoice;
        do {
            levelChoice = new Scanner(System.in).nextInt();
            if (levelChoice >= 1 && levelChoice <= 4) {
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        } while (true);
        switch (levelChoice) {
            case 1:
                this.setItemType(GoodsGroup.DIEN_TU);
                break;
            case 2:
                this.setItemType(GoodsGroup.DIEN_LANH);
                break;
            case 3:
                this.setItemType(GoodsGroup.MAY_TINH);
                break;
            case 4:
                this.setItemType(GoodsGroup.THIET_BI_VAN_PHONG);
                break;
        }
        System.out.println("Nhập giá bán cho mặt hàng: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.println("Nhập số lượng mặt hàng: ");
        this.quantity = new Scanner(System.in).nextInt();
    }
}
