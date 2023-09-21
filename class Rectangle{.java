class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double getArea() {
        return length*width;
    }

    public double getParameter() {
        return 2*(length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle( 2.0, 3.0);
        System.out.println("Parameter of a Rectangle is "+ rect.getParameter());
        System.out.println("An Area of a Rectanle is " + rect.getArea());
    }
}