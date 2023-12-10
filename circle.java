public class circle extends shape2D{

    public circle(double radius, double height, double width) {
        super(radius, height, width);
    }



    public double getarea(){
        double area = radius * radius * pi;
        return area;
    }
}
