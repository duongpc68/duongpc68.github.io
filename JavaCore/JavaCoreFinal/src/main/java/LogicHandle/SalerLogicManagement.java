package LogicHandle;

import Entity.Saler;

import java.util.Scanner;

public class SalerLogicManagement implements Comparable<Saler> {

    private Saler[] salers = new Saler[100];
   public int  salerNumber = 0;

    public Saler[] getTeachers() {
        return salers;
    }

    public Saler[] getSalers() {
        return salers;
    }

    public void setSalers(Saler[] salers) {
        this.salers = salers;
    }

    public int getSalerNumber() {
        return salerNumber;
    }

    public void setSalerNumber(int salerNumber) {
        this.salerNumber = salerNumber;
    }

    public void inputNewSaler() {
        System.out.println("Bạn muốn thêm mới bao nhiêu nhân viên bán hàng: ");
        int salerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < salerNumber; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            Saler saler = new Saler();
            saler.inputInfo();
            saveSaler(saler);
        }
    }

    private void saveSaler(Saler saler) {
        for (int j = 0; j < salers.length; j++) {
            if (salers[j] == null) {
                salers[j] = saler;
                break;
            }
        }
    }

    public void showSaler() {
        for (int i = 0; i < salers.length; i++) {
            if (salers[i] != null) {
                System.out.println(salers[i]);
            }
        }
    }

   public boolean salerIsNotEmpty() {
        for (int i = 0; i < salers.length; i++) {
            if (salers[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Saler o) {
        return 0;
    }
}

