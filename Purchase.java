package petshop;

public class Purchase<Item> {
    private Item item;
    private int quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Purchase(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String toString() {
        return "Purchase [item=" + item + ", quantity=" + quantity + "]";
    }
}