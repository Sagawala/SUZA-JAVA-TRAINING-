public class Sedan extends Car{
    private int length;
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
        }
    public void setLength(int length) {
        this.length = length;
        }
    public int getLength() {
        return length;
        }
    public double getSalePrice(){
        double discount = 0;
        if (length > 20){
            discount = 0.05*super.getRegularPrice();
        }
        else{
            discount = 0.1*super.getRegularPrice();
            }
        return super.getRegularPrice() - discount;
        }
    @Override
    public String toString() {
        return "Sedan [length=" + length + "]";
        }
}
