package ex9;

//A test driver for the Cylinder class
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Radius is " + cylinder1.getRadius()
                + ", Height is " + cylinder1.getHeight()
                + ", Color is " + cylinder1.getColor()
                + ", Base area is " + cylinder1.getArea() //можно использовать ...+ String.format("%.5f", cylinder1.getArea())
                + ", Volume is " + cylinder1.getVolume()); //можно использовать ...+ String.format("%.4f", cylinder1.getVolume()));
        Cylinder cylinder2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cylinder2.getRadius()
                + ", Height is " + cylinder2.getHeight()
                + ", Color is " + cylinder2.getColor()
                + ", Base area is " +
                String.format("%.5f", cylinder2.getArea())
                + ", Volume is " +
                String.format("%.4f", cylinder2.getVolume()));
    }
}
