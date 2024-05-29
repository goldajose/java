package class_obj;

public class Rectangle {
    private double length;
    private double breadth;

    public  Rectangle() {
        length = 0;
        breadth =0;
    }
    public  Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth =breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

     public double calculateArea() {
        return (2 * length) + (2 * breadth);
    }
     public double calculatePerimeter() {
        return length * breadth;
    }
}
