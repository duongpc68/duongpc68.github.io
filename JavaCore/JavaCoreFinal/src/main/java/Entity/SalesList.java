package Entity;

import java.util.Arrays;
import java.util.Comparator;

public class SalesList implements Comparable<SalesList> {
private Saler saler;
private Items [] itemsList;
private int itemNumber;
private SaleListDetails [] details;

    public SaleListDetails[] getDetails() {
        return details;
    }

    public void setDetails(SaleListDetails[] details) {
        this.details = details;
    }

    public SalesList(Saler saler, SaleListDetails[] details){
    this.saler = saler;
    itemsList = new Items[5];
    itemNumber = 0;
}

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public Items[] getItemsList() {
        return itemsList;
    }

    public void setItemsList(Items[] itemsList) {
        this.itemsList = itemsList;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String toString() {
        return "SalesList{" +
                "saler=" + saler +
                ", itemsList=" + Arrays.toString(itemsList) +
                ", itemNumber=" + itemNumber +
                '}';
    }

    @Override
    public int compareTo(SalesList o) {
        return 0;
    }

}
