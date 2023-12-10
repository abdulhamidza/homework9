public class pyramid extends shape3D{
    public pyramid(int depth, int radius, int height, int width) {
        super(depth, radius, height, width);
    }

    public double getvolume(){
        double volume = 1/3 * height * width;
        return volume;
    }

    public double getarea(){
        double area = (1/2 * pi) + width ;
        return area;
    }
}
