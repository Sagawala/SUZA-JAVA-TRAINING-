import java.util.Scanner;
class question3{
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        System.out.println("Please enter 10 series of number:");
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
    }
}