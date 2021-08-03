package day38_CustomClass.pizzaTask;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOFPepperoniTopping;

    public void customOrder (char size, int numberOfCheeseTopping, int numberOFPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOFPepperoniTopping = numberOFPepperoniTopping;
    }



    public double calcCost(){
        double startingPrice = (size == 'S')? 10 : (size== 'M')?12:14;
        double totalPriceofToppings = 2* (numberOfCheeseTopping + numberOFPepperoniTopping);
        return (startingPrice+ totalPriceofToppings) * 1.08;
    }
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOFPepperoniTopping=" + numberOFPepperoniTopping +
                ", total price + $" +calcCost()+
                '}';
    }

}
