package ex9;
//Пример №9. Переопределение метода

class Circle {
    private double radius;
    private String color;
    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    // Getters and Setters
    public double getRadius() {return this.radius;}
    public String getColor() {return this.color;}
    public void setRadius(double radius) {this.radius = radius;}
    public void setColor(String color) {this.color = color;}
    // Describe itself

    @Override //хорошо бы писать перед переопределение toString
    public String toString() { //описывает в виде строки содержимое объекта
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
    // Return the area of Circle
    public double getArea() {return radius * radius * Math.PI; }
}
