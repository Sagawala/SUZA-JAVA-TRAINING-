public class RectangleLeoTest {
    public static void main(String[] args) {
        RectangleLeo rleo = new RectangleLeo(2.0, 3.0);
        System.out.println(rleo.getLength());
        System.out.println(rleo.getWidth());

        System.out.println(rleo.getArea());
        System.out.println(rleo.getPerimeter());

        System.out.println("Change Values");
        rleo.setLength(4.5);
        rleo.setWidth(5.0);

        // System.out.println(rleo.getLength());
        // System.out.println(rleo.getWidth());
        System.out.println(rleo);
        System.out.println(rleo.getArea());
        System.out.println(rleo.getPerimeter());
    }
}
