package day47_Recap.PhoneTask;

public class Phone {
    private final String brand;
    private final String model;
    private final String size;
    private String color;
    private double price;
    public final static boolean isTouchScreen ;
    public final static boolean hasSimCard;

    static{
        isTouchScreen = true;
        hasSimCard = true;
    }

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        setColor(color);
        setPrice(price);    }

    public double getPrice(){
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setPrice(double price){
        if(price< 0){
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void call(long phoneNumber){
        System.out.println("phone is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("phone is texting " + phoneNumber);
    }

}
