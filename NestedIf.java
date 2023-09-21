public class NestedIf{

    public static void main(String [] args){
         
         int A = 50,B= 20,C= 60;

         if (A > B){
             if (A> C){
                System.out.println("A");
             }
            else{
                System.out.println("C");
            }
         }
         else{
            System.out.println("B");
         }


    }
    
}