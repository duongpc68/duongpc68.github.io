package Entity;

public class SaleListDetails {
    private Saler saler;
    private Items items;
    private int itemQuantity;

    public SaleListDetails(Saler saler, Items items, int itemQuantity) {
        this.saler = saler;
        this.items = items;
        this.itemQuantity = itemQuantity;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public SaleListDetails(Saler saler, int itemQuantity) {
        this.saler = saler;
        this.itemQuantity = itemQuantity;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "SaleListDetails{" +
                "saler=" + saler +
                ", items=" + items +
                ", itemQuantity=" + itemQuantity +
                '}';
    }
}

