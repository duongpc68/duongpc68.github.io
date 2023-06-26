package LogicHandle;

import Entity.Services;

import java.util.Scanner;

public class ServiceLogicManagement {
    private Services[] services = new Services[100];

    public Services[] getServices() {
        return services;
    }
    public void inputNewService() {
        System.out.println("Bạn muốn nhập dữ liệu cho bao nhiêu dịch vụ: ");
        int serviceNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < serviceNumber; i++) {
            Services service = new Services();
            service.inputInfo();
            saveService(service);
        }
    }
    public void saveService(Services subject) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] == null) {
                services[i] = subject;
                break;
            }
        }
    }
    public void showService() {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null) {
                System.out.println(services[i]);
            }
        }
    }


}
