public class Digit{

    public static void main(String [] args){

        int number = 42339;

        if((number >= 10000) && (number <= 99999)){
            System.out.printf("%d ",(number/10000));

            System.out.printf("%d ",(number/1000)%10);
            System.out.printf("%d ",(number/100)%10);
             System.out.printf("%d ",(number%100)/10);
            System.out.printf("%d ",number%10);
                
        }
    }
}