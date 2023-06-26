package Entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Services {
    public int AUTO_ID = 100;
    private int serviceID;

    private String serviceName;
    private double servicePrice;
    private String unit;

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Services{" +
                ", serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", unit='" + unit + '\'' +
                '}';
    }
    public void inputInfo(){
        this.serviceID = AUTO_ID;
        AUTO_ID++;
        try{
            System.out.println("Nhập tên dịch vụ: ");
            this.serviceName = new Scanner(System.in).nextLine();
        }catch (InputMismatchException e){
            System.out.println("Tên dịch vụ phải là chữ!");
        }
        try{
            System.out.println("Nhập giá cước dịch vụ: ");
            this.servicePrice = new Scanner(System.in).nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Giá cước phải là số nguyên!");
        }
        try{
            System.out.println("Nhập đơn vị tính: ");
            this.unit = new Scanner(System.in).nextLine();
        }catch (InputMismatchException e){
            System.out.println("Đơn vị tính là chữ!");
        }



    }
}
