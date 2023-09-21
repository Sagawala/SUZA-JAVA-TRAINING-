import java.util.*;
import java.text.*;
class Quesion4{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);
        //Qn1
        /*System.out.println("Please enter number of Year:");
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
        */

        //Qn2
        /*int sum = 0;
        System.out.println("Please enter Positive Integer & Negative integer to Terminate:");
        while(true){
            int num = put.nextInt();
            if(num < 0){
                System.out.println("You enter negative integer: "+num);
                break;
            }
            sum += num;
        }
        System.out.println("The sum of your number is "+sum);
        */

        //Qn3
        /*System.out.println("Please enter 10 series of number:");
        int[] number = new int[10];
        for(int i=0;i<number.length;i++) {
            System.out.println("Enter value: "+(i+1));
            number[i] = put.nextInt();
        }
        int largest = number[0];
        for(int i=0;i<number.length;i++) {
            if(number[i] > largest) largest = number[i];
        }
        System.out.println("Largest number is "+largest);
        */
        
        //Qn4
        /*System.out.println("Please enter number of student:");
        int StuNum = put.nextInt();
        int[] score = new int[StuNum];
        for(int i=0;i<StuNum;i++) {
            System.out.println("Student: "+(i+1));
            System.out.println("Enter Score: between 0 - 100");
            score[i] = put.nextInt();
        }
        int sum = 0;
        for(int i :score ){
            sum += i;
        }
        Arrays.sort(score);
        double average = sum/StuNum;
        System.out.println("Average is "+df.format(average));
        System.out.println("Maxmum is "+score[score.length-1]);
        System.out.println("Minimum is "+score[0]);
        */

        //Qn5
        System.out.println("Please enter your Budget for month:");
        int budget = put.nextInt();
        System.out.println("Please enter each expense for month, if you finish enter \"00\"");
        int sum = 0;
        while(true){
            int exps = put.nextInt();
            if(exps == 00){
                System.out.println("You finish your expenses ");
                break;
            }
            sum += exps;
        }
        System.out.println("Total Budget is "+budget);
        if(sum < budget) System.out.println("Total expenses is "+sum+" \"Under Budget\"");
        else if(sum > budget) System.out.println("Total expenses is "+sum+" \"Over Budget\"");
        else System.out.println("Total expenses is "+sum+" \"Equal Budget\"");
     
    }
}