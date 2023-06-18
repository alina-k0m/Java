package ex9;

// A Cylinder is a Circle plus a height
class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super(); // invoke superclass' constructor Circle()
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super(); // invoke superclass' constructor Circle()
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);// invoke superclass' constructor Circle(radius)
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);// invoke superclass' constructor Circle(radius, color)
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
// Override the getArea() method inherited from superclass Circle
    @Override

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Return the volume of this Cylinder
    public double getVolume() {
        return super.getArea() * height; // use superclass' getArea()
    }

    // Describe itself
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" +
                height + "]";
    }
}
