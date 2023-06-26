package Entity;

import Static.CustomerLevel;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Customers {
    public int AUTO_ID = 10000;
    private int id;
    private String name;
    private  String address;
    private int phone;
    private CustomerLevel level;

    public CustomerLevel getLevel() {
        return level;
    }
public Customers(){
        this.id = AUTO_ID;
        AUTO_ID++;
}
    public void setLevel(CustomerLevel level) {
        this.level = level;
    }

    public Customers(int AUTO_ID, int id, String name, String address, int phone, CustomerLevel level) {
        this.id = AUTO_ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        AUTO_ID++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
    public void inputInfo() {
        System.out.println("Nhập tên Khách Hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ Khách hàng: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại Khách hàng: ");
        this.setPhone(new Scanner(System.in).nextInt());
        try {
            int levelChoice = 0;
            while (true) {
                System.out.println("Chọn loại Khách hàng: ");
                System.out.println("1. Cá Nhân");
                System.out.println("2. Đại Diện Đơn Vị Hành Chính");
                System.out.println("3. Đại Diện Đơn Vị Kinh Doanh");
                try {
                    levelChoice = new Scanner(System.in).nextInt();
                    if (levelChoice >= 1 && levelChoice <= 3) {
                        break; // Thoát khỏi vòng lặp nếu lựa chọn hợp lệ
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Vui lòng nhập một số nguyên!");
                }
            }

            switch (levelChoice) {
                case 1:
                    this.setLevel(CustomerLevel.CA_NHAN);
                    break;
                case 2:
                    this.setLevel(CustomerLevel.DAI_DIEN_DON_VI_HANH_CHINH);
                    break;
                case 3:
                    this.setLevel(CustomerLevel.DAI_DIEN_DON_VI_KINH_DOANH);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi chọn loại Khách hàng: " + e.getMessage());
        }
            }
}

