package tangpos;

import java.util.ArrayList;

class Receipts {
    
    private ArrayList<Receipt> receipts;

    public Receipts() {
        receipts = new ArrayList<>();
    }

    public void addreceipt(String customerName, String productName, int quantity, int price, int cash) {
        Receipt receipt = new receipt(customerName, productName, quantity, price, cash);
        receipts.add(receipt);
    }

    public void viewReceipts() {
        if (receipts.isEmpty()) {
            System.out.println("No receipts available.");
            return;
        }
        for (Receipt receipt : receipts) {
            receipt.display();
        }
    }
}


