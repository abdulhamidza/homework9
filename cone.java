public class cone extends shape3D{
    public cone(double depth, double radius, double height, double width) {
        super(depth, radius, height, width);
    }

    public double getvolume(){
        double volume = pi * 2 * radius * height;
        return volume;
    }

    public double getarea(){
        double area = height + width ;
        return area;
    }

}

