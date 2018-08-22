package tiendat.thinkpad.rectangle;

public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public  double getWidth() {
        return this.width ;
    }

    public  double getHeight() {
        return this.height ;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
