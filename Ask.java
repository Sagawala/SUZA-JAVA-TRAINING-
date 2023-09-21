import java.util.Scanner;
class Ask{
    public static void main(String[]args){
      Scanner ask = new Scanner(System.in);
      System.out.println("enter your name");
      String a =ask.next();
      System.out.println("enter your age");
      int b = ask.nextInt();
      System.out.println("welcome"+" "+ a +"you are "+ b + " "+"years old" );
    }
}