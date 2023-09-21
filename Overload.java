public class Overload {
    void display() {
        System.out.println("No parameter");
    }

    void display(int a) {
        System.out.println("a=" + a);
    }

    void display(int a, int b) {
        System.out.println("a=" + a + " b=" + b);
    }

    void display(double a) {
        System.out.println("a=" + a);
    }
}