package JAVA_MASTER;
import java.util.Scanner;
public class UserAcceptance {
    public static void main (String [] args){
        Scanner novio = new Scanner(System.in);
        Scanner novio1 = new Scanner(System.in);
        
        System.out.println("please enter the first no:");
        double no1 = novio.nextDouble();

        System.out.println("please enter the sec no:");
        double no2 = novio1.nextDouble();

        System.out.println("Answer:"+ no1 + no2);
        

        
    }
}
