public class shape3D extends shape2D{
    public double depth;

    public shape3D(double depth, double radius, double height, double width) {
        super(radius, height, width);
        this.depth = depth;
    }

    public double getvolume(){
        double volume = depth * height * width;
        return volume;
    }

    @Override
    public String toString() {
        return "shape3D{" + "depth=" + depth + '}';
    }
}
