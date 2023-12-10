public class sphere extends shape3D{
    public sphere(int depth, double radius, double height, double width) {
        super(depth, radius, height, width);
    }

    public double getvolume(){
        double volume = 4/3 * pi * height * radius * radius * radius;
        return volume;
    }

    public double getarea(){
        double area = 4 * pi * radius * radius;
        return area;
    }

}
