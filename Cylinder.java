package lab6;

public class Cylinder extends Circle {
    private  double height;

    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("construced a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("consrtruced a Ctlinder with cylinder()");
    }
    public Cylinder(double height,double radius,String color){
        super();
        this.height = height;
        System.out.println("consrtruced a Ctlinder with cylinder()");
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public  double getVolume(){
        return getArea() * height;
    }
    public  String toString(){
        return "this is a Cylinder";
    }

}
