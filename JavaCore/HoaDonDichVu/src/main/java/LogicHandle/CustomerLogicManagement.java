package LogicHandle;

import Entity.Customers;

import java.util.Scanner;
import Exception.CustomerNotFoundException;

public class CustomerLogicManagement {
    private static Customers [] customers = new Customers[10000];

    public Customers[] getCustomers() {
        return customers;
    }
    public static void inputNewCustomer(){
        System.out.println("Bạn muốn thêm mới bao nhiêu khách hàng: ");
        int customerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < customerNumber; i++){
            System.out.println("Nhập thông tin khách hàng thứ:" + (i +1));
            Customers customer = new Customers();
            customer.inputInfo();
            saveCustomer(customer);
        }
    }
    public static void saveCustomer(Customers customer) {
        for (int j = 0; j < customers.length; j++) {
            if (customers[j] == null) {
                customers[j] = customer;
                break;
            }
        }
    }
    public static void showCustomer() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(customers[i]);
            }
        }
    }
    public static Customers findCustomerId(int customerId) throws CustomerNotFoundException {
        for (Customers customers1 : customers) {
            if (customers1.getId() == customerId) {
                return customers1;
            }
        }
        throw new CustomerNotFoundException("Khách hàng không tồn tại");
    }
}

