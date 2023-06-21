package Entity;

import java.util.Scanner;

public class Person implements inputInfo {
    protected String name;
    protected String adDress;
    protected int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdDress() {
        return adDress;
    }

    public void setAdDress(String adDress) {
        this.adDress = adDress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adDress='" + adDress + '\'' +
                ", phone=" + phone +
                '}';
    }
    @Override
    public void inputInfo(){
        System.out.println("Nhập tên");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ");
        this.setAdDress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại");
        this.setPhone(new Scanner(System.in).nextInt());
    }
}
