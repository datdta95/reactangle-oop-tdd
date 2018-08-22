package tiendat.thinkpad.rectangle;

public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public String display() {
        return "Hình chữ nhật có chiều dài là " + (int) this.width + " và chiều rộng là " + (int) this.height;
    }
}
