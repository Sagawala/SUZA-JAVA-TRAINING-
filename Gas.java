import java.util.Scanner;
public class Gas{
    public static void main(String [] args){
        Scanner gas = new Scanner(System.in);

        int gallon;
        int price;
        int mile;
        // 1 mile = 500 price
        
        System.out.println("number of gallon ");
        gallon = gas.nextInt();

        System.out.println("price of each gallon ");
        price = gas.nextInt();

        System.out.println("number of mile ");
        mile = gas.nextInt();

        int distance = mile / gallon ;

        int cost = 250/gallon * price;



        System.out.println("distance of travel " + distance +" cost of 250 miles  "+ cost);


    }
}