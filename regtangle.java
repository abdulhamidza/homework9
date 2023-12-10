public class regtangle extends shape2D{
    public regtangle(double radius, double height, double width) {
        super(radius, height, width);
    }



    public double getarea(){
        double area = height * width;
        return area;
    }
}
