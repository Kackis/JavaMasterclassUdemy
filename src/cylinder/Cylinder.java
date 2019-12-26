package cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if(height <=0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume (){
        double Volume = 0;
        Volume = getArea() * height;
        return Volume;
    }
}
