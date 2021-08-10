package day42_CustomClass_Constructor.warmUp;

public class Item {
    public String name;
   public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double castCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice = $" + unitPrice +
                ", quantity = " + quantity +
                ", Total price = $" + quantity +
                '}';
    }
}
