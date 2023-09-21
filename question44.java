import java.util.Scanner;
import java.util.Arrays;
class question4{
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        System.out.println("Please enter number of student:");
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
        System.out.println("Average is "+average);
        System.out.println("Maxmum is "+score[score.length-1]);
        System.out.println("Minimum is "+score[0]);
    }
}