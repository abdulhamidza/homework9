public class cylinder extends shape3D {
    public cylinder(double depth, double radius, double height, double width) {
        super(depth, radius, height, width);
    }

    public double getvolume(){
        double volume = pi * height * radius * radius;
        return volume;
    }

    public double getarea(){
        double area = 2 * pi * radius * (radius + height);
        return area;
}
}
