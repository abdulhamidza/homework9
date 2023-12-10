public class shape2D {
    public double height;
    public double radius;
    public double width;
    public final double pi = 3.14d;

    public shape2D(double radius, double height, double width) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }


    public double getarea(){
        double area = height * radius * width;
        return area;
    }

    @Override
    public String toString() {
        return "shape2D{" + "height=" + height + ", radius=" + radius + ", width=" + width + ", pi=" + pi + '}';
    }

}
