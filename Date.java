import javax.management.relation.InvalidRelationIdException;

public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int d,int m,int y){
        this.day = d;
        this.year = y;
        if(m >= 1 && m <=12)this.month = m;
        else{
            this.month = 1;
            System.out.println("You enter invalid month, default set 1");
        }   
    }
    public void displayDate(){
        System.out.println("The date is: "+day+"/"+month+"/"+year);
    }
    public static void main(String[] args){
        Date date = new Date(12,8,2022);
        date.displayDate();
        
    }
}