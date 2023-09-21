import java.util.Scanner;
class question1{
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        System.out.println("Please enter number of Year:");
        int year = put.nextInt();
        int totalRainfall = 0;
        for(int i=1;i<=year;i++) {
            System.out.println("Year: "+(i));
            for(int m=1;m<=12;m++) {
                System.out.println("Enter inches of rainfall for month: "+(m));
                int inche = put.nextInt();
                totalRainfall += inche;
            }
        }
        int totalMount = year*12;
        double average = totalRainfall/totalMount;

        System.out.println("Number of months is "+totalMount);
        System.out.println("Total inches of rainfall is "+totalRainfall);
        System.out.println("The average rainfall is "+average);
    }
}