package LogicHandle;

import Entity.Bill;
import Entity.Customers;
import Entity.Services;
import Exception.CustomerNotFoundException;
import Exception.ServiceNotFoundException;

import java.util.Scanner;


public class BillLogicManagement {
    private static Bill[] billList = new Bill[100];

    public static void sortByName() {
        int n = billList.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (billList[j].getCusstomers().getName().compareTo(billList[j + 1].getCusstomers().getName()) > 0) {
                    // Hoán đổi vị trí
                    Bill temp = billList[j];
                    billList[j] = billList[j + 1];
                    billList[j + 1] = temp;
                }
            }
        }
    }
        public static void sortByNumbers () {
            int n = billList.length;
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (billList[j].getServiceNumber() > billList[maxIndex].getServiceNumber()) {
                        maxIndex = j;
                    }
                }
                // Hoán đổi vị trí
                Bill temp = billList[i];
                billList[i] = billList[maxIndex];
                billList[maxIndex] = temp;
            }
        }
    }

