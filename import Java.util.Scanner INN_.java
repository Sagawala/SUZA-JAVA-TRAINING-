import java.util.Scanner;
import java.lang.Math;
class inn{
    public static void main(String[] args) {
        System.out.println("user input");

        Scanner n = new Scanner(System.in);
        System.out.println("new no. 1");
        int n1=n.nextInt();
        System.out.println("new no. 2");
        int n2=n.nextInt();
        System.out.println("the greater umber is"+Math.max(n1, n2));//optional if you have 2 comparison only

        if (n1>n2){
            System.out.println("Number:"+ n1+" "+"is greater");

        }
        else{
            System.out.println("Number:"+ n2+" "+"is greater");
        }
    }
}