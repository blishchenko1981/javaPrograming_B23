package task0308;

public class Item {
    public String name;
    public double price;
    public int quantity;

    public void setInfo(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "task0308.Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
/*Create a class called task0308.Item
    Instance variables:
        - name (String), price (double), quantity (int)

    Instance methods:
        - setInfo(): Accepts and initializes all three variables
        - toString(): returns information about task0308.Item
 */