package day47_Recap.PhoneTask;

public class PhoneObject {
    public static void main(String[] args) {


        Iphone iphone =new Iphone("12", "large", "black", 1000);

        Samsung samsung = new Samsung("galaxy", "small", "grey", 500);

        Nokia nokia = new Nokia("brick", "huge", "blue", 345);

        iphone.call(4323);
        iphone.call(324332, 234324,24324000);
        iphone.faceTime(33423423);

        System.out.println("======================");
        samsung.call(4534534);
        samsung.freeze();
        samsung.text(453453, 345353,354353);

        System.out.println("=======================");
        nokia.selfDefence();
        nokia.call(34324234);
        nokia.text(34234234);

        nokia.setColor("grey");
        nokia.getPrice();
        nokia.getColor();
        nokia.setColor("white");
        System.out.println(nokia.getColor());





    }
}