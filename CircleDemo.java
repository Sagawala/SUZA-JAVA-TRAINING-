public class CircleDemo {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        System.out.println(cy.toString());
        Cylinder cy2 = new Cylinder("red", 2.5, 2.5);
        System.out.println(cy2.toString());
    }

}
