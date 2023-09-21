public class Example {
    private static int staticfield = 0;
    private int instancefield;

    public Example(int i) {
        instancefield = i;
        staticfield++;
    }

    public void show() {
        System.out.println("Value of Static field " + staticfield
                + "\nValue of Instance filed" + instancefield);
    }

    public static int cube(int number) {
        return number * number * number;
    }
}