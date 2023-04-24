public class Item {

    int itemNumber, quantityOnHand;
    String itemDescription;
    double unitPrice;
    static double inventory;

    public Item (int num, String description, double price, int qt){
        itemNumber = num;
        itemDescription = description;
        unitPrice = price;
        quantityOnHand = qt;
    }

    public void DisplayItemInfo(){
        System.out.println("Item: " + itemNumber);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Price: " + unitPrice);
        System.out.println("Quantity on hand: " + quantityOnHand);
    }

    public void ComputeInventory(){
        inventory= quantityOnHand * unitPrice;
        System.out.println("INVENTORY: " + inventory);
    }
    
    public static void main(String[] args) throws Exception {
        Item [] objArray = new Item[5];

        objArray[0] = new Item(001, "toothbrush", 90, 6);
        objArray[1] = new Item(002, "toothpaste", 150, 3);
        objArray[2] = new Item(003, "soap", 450, 5);
        objArray[3] = new Item(004, "shampoo", 350, 5);
        objArray[4] = new Item(005, "conditioner", 120, 1);

      for (int i=0; i < 5; i++){
        System.out.println("Item [" + (i+1)+"]");
        objArray[i].DisplayItemInfo();
        objArray[i].ComputeInventory();
        System.out.println();
    }
}
}
