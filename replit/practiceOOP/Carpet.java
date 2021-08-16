package practiceOOP;

public class Carpet {
    public double width, length, unitPrice; public int totalPrice;
    public boolean isPersian;

    public Carpet() {
        unitPrice = 0;
        width = 300;
        length = 300;
        isPersian= true;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = (int) ( width* length*unitPrice);
        if(isPersian == true){
            totalPrice = totalPrice + 200;
        }
    }




}
