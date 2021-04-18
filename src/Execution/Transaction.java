package Execution;


import Definition.LineItem;

import javax.xml.namespace.QName;
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

    public Definition.LineItem addLineItem(String itemName, int Quantity, double price){
        lineItems.add(addLineItem(itemName,Quantity,price));
        return null;
    }
     public void UpdateItem(String itemname,int Quantity,double price){
        for (LineItem lineItem : lineItems){
            if (lineItem.getItemName().equalsIgnoreCase()){
                lineItem.setPrice(price);
                lineItem.setQuantity(Quantity);
                break;
            }
        }
     }
     public double getTotalPrice(){
        return
     }

}


