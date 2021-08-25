package planet;

public class PlanetObject {
    public static void main(String[] args) {

        Earth planet1 = new Earth("Earth",6*10^24,6378,9.8, 510.1,10^12, 7.6);
        System.out.println(planet1);
        System.out.println("-------------------------------------");

        Moon planet2 = new Moon("Moon",7*10^22, 1737, 1.62, 38, 2*10^10, 0 );

        System.out.println(planet2);
    }
}
