package Execution;


import Definition.LineItem;


import java.util.ArrayList;

public class Transaction {

    public final ArrayList<LineItem> lineItems;
    private int customersID;
    private String customersName;
    private String LineItem;
    private int i;

    public Transaction(int customersID, String customersName) {
        this.customersID = customersID;
        this.customersName = customersName;
        lineItems = new ArrayList<>();
    }

    public int getCustomersID() {
        return customersID;
    }

    public void setCustomersID(int customersID) {
        this.customersID = customersID;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public Definition.LineItem addLineItem(String itemName, int Quantity, double price) {
        lineItems.add(addLineItem(itemName, Quantity, price));
        return null;
    }

    public void UpdateItem(String itemname, int Quantity, double price) {
        for (LineItem lineItem : lineItems) {
            if (lineItem.getItemName().equalsIgnoreCase(itemname)) {
                lineItem.setPrice(price);
                lineItem.setQuantity(Quantity);
                break;
            }
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (LineItem lineItem : lineItems) {
            total += lineItem.getTotalPrice();
        }
        return total;
    }

    public String searchItem(String item) {
        String result = item + " not found";
        for (LineItem purchasedItem : lineItems) {
            if (purchasedItem.getItemName().equalsIgnoreCase(item)) {
                return purchasedItem.toString();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Customer ID : " + this.getCustomersID() + '\n' +
                "Customer Name : " + this.getCustomersName() + '\n' + '\n';
        for (LineItem purchasedItem : lineItems) {
            result += purchasedItem.toString();
        }
        result += '\n';
        result += "Transaction Total                          $" + this.getTotalPrice() + '\n';

        return result;

    }
}




