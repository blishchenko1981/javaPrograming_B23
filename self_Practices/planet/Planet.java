package planet;

public class Planet {
    private final  String name;
    private final double mass,radius,surfaceGravity,surfaceArea,population;
    double volume;

    public Planet(String name, double mass, double radius, double surfaceGravity,
                   double surfaceArea, double volume, double population){
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;



    }


    public String toString(){
        return "The planet "+ name + "\n"+
                "have mass " + mass + "tonn"+"\n"+
                "the radius is " + radius + "km" +"\n"+
                "surface gravity " + surfaceGravity+ "m/s^2"+"\n"+
                "surface Area " + surfaceArea + "millions km^2"+"\n"+
                "volume = " + volume + "km^3"+"\n"+
                "population " + population + "billions";

    }
}
