package Definition;

public class LineItem {

    public String itemName;
    public int quantity;
    public double price;

    public LineItem(String itemName, int quantity, double price){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice(){


     return quantity*price;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
