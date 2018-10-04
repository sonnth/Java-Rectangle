public class Rectangle {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
