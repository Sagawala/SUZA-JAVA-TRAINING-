import java.util.Scanner;
public class Minutes{

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your minutes : ");
        int minute =keyboard.nextInt();

        int minuteInYear = 60 * 24 * 365;

        int year =minute / minuteInYear;

        int day =  (minute / 60 /24) % 365;

        System.out.println(minute +" minutes is approximately " + year + " and " + day + " days");
    }
}