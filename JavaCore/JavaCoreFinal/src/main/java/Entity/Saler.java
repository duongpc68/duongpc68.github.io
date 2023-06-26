package Entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Saler extends Person {
    private static int AUTO_ID = 1000;
    private int saleId;
    public int  salerNumber = 0;
    private LocalDate contractSigningDate;

public Saler(){
    this.saleId = AUTO_ID;
    AUTO_ID++;
}

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;

    }

    public LocalDate getContractSigningDate() {
        return contractSigningDate;
    }

    public void setContractSigningDate(String contractSigningDate) {
        this.contractSigningDate = LocalDate.parse(contractSigningDate);
    }

    @Override
    public String toString() {
        return "Saler{" +
                ", saleId=" + saleId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", contractSigningDate=" + contractSigningDate +
                '}';
    }

    public int getSalerNumber() {
        return salerNumber;
    }

    public void setSalerNumber(int salerNumber) {
        this.salerNumber = salerNumber;
    }

    public void inputInfo()
    {
        super.inputInfo();
        System.out.println("Nhập ngày ký hợp đồng(yyyy - mm - dd): ");
        this.setContractSigningDate(new Scanner(System.in).next());
    }
}
