public class square extends shape2D{
    public square(double radius, double height, double width) {
        super(radius, height, width);
    }



    public double getarea(){
        double area = width * width;
        return area;
    }
}
