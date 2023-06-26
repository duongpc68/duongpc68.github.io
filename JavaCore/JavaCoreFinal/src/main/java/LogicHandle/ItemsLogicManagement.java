package LogicHandle;

import Entity.Items;
import Entity.Saler;

import java.util.Scanner;

public class ItemsLogicManagement implements Comparable<Items> {
    private Items [] items = new Items[1000];
    public Items[] getItems(){
        return items;
    }
    public void inputNewItem(){
        System.out.println("Bạn muốn thêm mới bao nhiêu mặt hàng: ");
        int itemNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < itemNumber; i++) {
            System.out.println("Nhập thông tin cho mặt hàng thứ " + (i + 1));
            Items item = new Items();
            item.inputInfo();
            saveItem(item);
        }
    }
    private void saveItem(Items item) {
        for (int j = 0; j < items.length; j++) {
            if (items[j] == null) {
                items[j] = item;
                break;
            }
        }
    }
    public void showItem() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }
   public boolean itemIsNotEmpty() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int compareTo(Items o) {
        return 0;
    }
}
