class Sample{
    private double length;
    private double width;

    public Sample(double length, double width){
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
        Sample rect = new Sample( 2.0, 3.0);
        System.out.println("arameter of Rectangle is "+ rect.getArea());
    }
}