public class Task17 {
    private double radius;
    private double height;


    public Task17(double radius, double height){
        this.radius=radius;
        this.height=height;

    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        Task17 circle=new Task17(5,6);
        System.out.println(circle.getArea());
        Cylinder cylinder=new Cylinder(5,3);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}

