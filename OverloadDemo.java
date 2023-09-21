public class OverloadDemo {
    public static void main(String[] args) {
        Overload ov = new Overload();

        ov.display();
        ov.display(2);
        ov.display(2, 3);
        ov.display(2.0);

    }
}
