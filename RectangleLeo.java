public class RectangleLeo {
    private double length;
    private double width;

    public RectangleLeo(double l, double w) {
        length = l;
        width = w;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Length of the Rectangle is" + getLength() + " and Width is " + getWidth();
    }
}