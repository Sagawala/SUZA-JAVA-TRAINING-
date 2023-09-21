import java.util.Scanner;
public class Egg{
    public static void main(String [] args){
        Scanner egg = new Scanner(System.in);
       
        int eggs;
        

        System.out.println("enter number of eggs : ");
        eggs  =egg.nextInt();
         int gross ;
          gross = eggs / 144;

           int abovegross; 
          abovegross = eggs % 144;

          int dozen = abovegross / 12;

          int remain = abovegross % 12;
          
        System.out.println("your number of egg " + gross + " your dozen " + dozen + " eggs used " + remain);

    }
}