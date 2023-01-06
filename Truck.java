
public class Truck extends Car{
    private int weight;
public Truck(int speed, double regularPrice, String color, int weight) {
    super(speed, regularPrice, color);
    this.weight = weight;
}
public void setWeight(int weight) {
    this.weight = weight;
}
public int getWeight() {
return weight;
}
public double getSalePrice(){
double discount = 0;
    if (weight > 2000){
        discount = 0.1*super.getRegularPrice();
        }   
    else{
        discount = 0.2*super.getRegularPrice();
    }
    return super.getRegularPrice() - discount;
}
@Override
public String toString() {
    return "Truck [weight=" + weight + "]";
}
}