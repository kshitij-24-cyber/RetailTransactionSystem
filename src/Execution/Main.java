package Execution;


import Definition.Transaction;

public class Main {
    public static void main(String[] args) {
        Transaction t1= new Transaction(12345,"John Doe");
        t1.addItem("Colgate Toothpaste",2,2.99d);
        t1.addItem("Bounty Paper Towels",1,1.49d);
        t1.addItem("Kleenex Tissue",1,2.49d);
        System.out.println(t1);
        t1.updateItem("Kleenex Tissue",3,2.5d);
        System.out.println(t1.searchItem("Kleenex Tissue"));
        System.out.println(t1);
    }
}
