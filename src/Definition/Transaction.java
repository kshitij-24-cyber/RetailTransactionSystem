package Definition;

import java.util.ArrayList;

public class Transaction {
    private int customerId;
    private String customerName;
    private ArrayList<LineItem> itemBuyed;

    public Transaction(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        itemBuyed = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addItem(String itemName, int quantity, double price) {
        itemBuyed.add(new LineItem(itemName, quantity, price));

    }

    public void updateItem(String itemName, int quantity, double price) {
        for (LineItem itemsBuyed : itemBuyed) {
            if (itemsBuyed.getItemName().equalsIgnoreCase(itemName)) {
                itemsBuyed.setPrice(price);
                itemsBuyed.setQuantity(quantity);
                break;
            }

        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (LineItem itemsbuyed : itemBuyed) {
            total += itemsbuyed.getTotalPrice();
        }
        return total;
    }

    public String searchItem(String item) {
        String result = item + "no item ";
        for (LineItem itemsbuyed : itemBuyed) {
            if (itemsbuyed.getItemName().equalsIgnoreCase(item)) {
                return itemsbuyed.toString();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Customer ID : " + this.getCustomerId() + '\n' +
                "Customer Name : " + this.getCustomerName() + '\n' + '\n';
        for (LineItem purchasedItem : itemBuyed) {
            result += purchasedItem.toString();
        }
        result += '\n';
        result += "Transaction Total                          $" + this.getTotalPrice() + '\n';

        return result;
    }
}
