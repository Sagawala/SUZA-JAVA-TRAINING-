import Java.util.Scanner;
class kuloop{
    public static void main(String[] args) {
        int i=1;
        int p=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        for(int z=1; z<=10; z++){
            System.out.println(z);
        }
        while(p<=10){
            if (p%2==0) {
                System.out.println(p);
            }
            p++;
        }
    }
}