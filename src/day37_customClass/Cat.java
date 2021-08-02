package day37_customClass;

public class Cat {
    public String name;
    public String gender;
    public String color;
    public String breed;
    public int age;

    public void scratch(){System.out.println( "cat " + name + " is scratching things ");
    }
    public void jump (String onBed) {System.out.println("cat " + name + " is jumping on " + onBed);
    }
    public void eat(String food) {System.out.println("Cat " + name + " is eating " + food);
    }
    public void drink(String drink){System.out.println("Cat " + name + " is drinking " + drink);
    }
    public void breakThings(String thing){System.out.println("cat " + name + " has broke the " + thing);
    }
    public void meow () {
        System.out.println("cat " + name + " is meowing ");
    }

    public void setInfo (String catsName, String catsBreed, String catsGender, String catsColor, int catsAge){
         name=catsName;
         breed=catsBreed;
         gender=catsGender;
         color = catsColor;
         age=catsAge;
    }

    public void getInfo (){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("gender = " + gender);
        System.out.println("color = " + color);
        System.out.println("age = " + age);
    }
}
