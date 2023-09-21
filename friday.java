import java.util.*;

public class friday{
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner put = new Scanner(System.in);
       /*  System.out.println("enter value of a");
        float a = put.nextFloat();
        System.out.println("enter value of b");
        float b = put.nextFloat();

        float c = a+b;

        System.out.println("Sum is :"+c);

        System.out.println("AFTER");

        a=a+c;
        System.out.println("new a is: "+a);
        System.out.println("new b is: "+b);

        c = a+b;


        System.out.println("Final Sum is :"+c); */
        System.out.println("Enter number of student");
        int n=put.nextInt();
        int[] score=new int[n];
        for (int i=0;i<score.length; i++){
            System.out.println("Enter score of student"+ (i+1));
        score[i]=put.nextInt();
        }
        Arrays.sort(score);
        for (int i:score){
            System.out.println(i);
        }
        System.out.println("DESCENDING");
        for (int i=(score.length)-1;i>=0; i--){
        System.out.println(score[i]);
        }
        

    }
}