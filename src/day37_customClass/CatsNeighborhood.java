package day37_customClass;

public class CatsNeighborhood {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.meow();

        cat1.setInfo("Barsic", "JustCat", "Male", "Grey", 3);
        cat1.getInfo();

        cat1.meow();

        Cat cat2 = new Cat();
        cat2.setInfo("Fufu", "Siberyan", "male", "black", 3);

        cat2.getInfo();
        cat2.breakThings("Lamp");
        cat1.eat("cheese");
        cat2.drink("milk");

    }
}
