public class Cylinder extends Task17 {
    public Cylinder(double radius, double height) {
        super(radius,height);
    }
    public double getArea(){
        return getRadius()*getHeight();
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
}
