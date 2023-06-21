package Entity;

import Statics.ReporterLevel;

import java.util.Scanner;

public class Reporter extends Person {
    private int AUTO_ID = 10000;
    private int idReporter;
private String reporterLevel;

    public String getReporterLevel() {
        return reporterLevel;
    }

    public void setReporterLevel(String reporterLevel) {
        this.reporterLevel = reporterLevel;
    }

    public Reporter(){
        this.AUTO_ID = idReporter;
        AUTO_ID++;
    }

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getIdReporter() {
        return idReporter;
    }

    public void setIdReporter(int idReporter) {
        this.idReporter = idReporter;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "AUTO_ID=" + AUTO_ID +
                ", idReporter=" + idReporter +
                ", reporterLevel='" + reporterLevel + '\'' +
                ", name='" + name + '\'' +
                ", adDress='" + adDress + '\'' +
                ", phone=" + phone +
                '}';
    }
    @Override
    public void inputInfo(){
super.inputInfo();
        System.out.println("Nhập loại phóng viên:");
        System.out.println("1.Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        int levelChoice;
        do {
            levelChoice = new Scanner(System.in).nextInt();
            if (levelChoice >= 1 && levelChoice <= 3) {
                break;
            }
            System.out.println("vui lòng nhập lại!");
        }
        while (true);
        switch (levelChoice){
            case 1:
                this.setReporterLevel(String.valueOf(ReporterLevel.CHUYEN_NGHIEP));
                break;
            case 2:
                this.setReporterLevel(String.valueOf((ReporterLevel.NGHIEP_DU)));
                break;
            case 3:
                this.setReporterLevel(String.valueOf(ReporterLevel.CONG_TAC_VIEN));
                break;
        }

    }
}
