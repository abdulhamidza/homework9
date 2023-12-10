
public class Main {
    public static void main(String[] args) {
        shape2D myShape2D = new shape2D(3.0, 4.0, 5.0);
        circle myCircle = new circle(2.0, 0.0, 0.0);
        square mySquare = new square(0.0, 0.0, 4.0);
        regtangle myRectangle = new regtangle(0.0, 2.0, 6.0);

        // Display information about shape2D and its subclasses
        System.out.println("shape2D: " + myShape2D);
        System.out.println("shape2D Area: " + myShape2D.getarea());

        System.out.println("\nCircle: " + myCircle);
        System.out.println("Circle Area: " + myCircle.getarea());

        System.out.println("\nSquare: " + mySquare);
        System.out.println("Square Area: " + mySquare.getarea());

        System.out.println("\nRectangle: " + myRectangle);
        System.out.println("Rectangle Area: " + myRectangle.getarea());

        // Create instances of shape3D and its subclasses
        shape3D myShape3D = new shape3D(4.0, 3.0, 2.0, 1.0);
        cylinder myCylinder = new cylinder(5.0, 2.0, 0.0, 0.0);
        sphere mySphere = new sphere(06, 3.0, 0.0, 0.0);
        pyramid myPyramid = new pyramid(4, 20, 30, 050);
        cone myCone = new cone(3.0, 1.0, 2.0, 0.0);

        // Display information about shape3D and its subclasses
        System.out.println("\nshape3D: " + myShape3D);
        System.out.println("shape3D Volume: " + myShape3D.getvolume());

        System.out.println("\nCylinder: " + myCylinder);
        System.out.println("Cylinder Volume: " + myCylinder.getvolume());
        System.out.println("Cylinder Surface Area: " + myCylinder.getarea());

        System.out.println("\nSphere: " + mySphere);
        System.out.println("Sphere Volume: " + mySphere.getvolume());
        System.out.println("Sphere Surface Area: " + mySphere.getarea());

        System.out.println("\nPyramid: " + myPyramid);
        System.out.println("Pyramid Volume: " + myPyramid.getvolume());
        System.out.println("Pyramid Surface Area: " + myPyramid.getarea());

        System.out.println("\nCone: " + myCone);
        System.out.println("Cone Volume: " + myCone.getvolume());
        System.out.println("Cone Surface Area: " + myCone.getarea());
    }

    }
