package day43_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {
       // System.out.println(AccessModifiers.privateVariable);//  this AM is NOT !!!! reachable within the same package;
        System.out.println(AccessModifiers.defaultVariable);//  this AM reachable within the same package;
        System.out.println(AccessModifiers.publicVariable);//  this AM reachable within the same package;


        EncapsulationIntro obj = new EncapsulationIntro();
       /* System.out.println(obj.username);
        System.out.println(obj.password);
        obj.username = "H";
        obj.password = "123";
        System.out.println(obj.username);
        System.out.println(obj.password);


 */
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setUsername("CybertekSchool");
        obj.setPassword("Cybertek12345");
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
    }


}
