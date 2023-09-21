import java.util.Scanner;
public class WordGame{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        String name;
        int age;

        System.out.println("enter your name : ");
        name =obj.nextLine();

        System.out.println("enter your age : ");
        age =obj.nextInt();

        System.out.println("my name is " + name + " my age is" + age);

    }
}