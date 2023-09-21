import java.util.Scanner;
class kuswitch{
    public static void main(String[] args) {
        System.out.println("lets switch");

        Scanner n = new Scanner(System.in);
        System.out.println("Enter marks");
        int nm=n.nextInt();

        switch(nm){
            case 5:
            System.out.println("A");
            break;

            case 4:
            System.out.println("B");
            break;

            case 3:
            System.out.println("C");
            break;

            case 2:
            System.out.println("D");
            break;

            default:
            System.out.println("E");
            break;
        }
    }
}