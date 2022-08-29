/**
 * Aggregation : If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship. */
class Operation{
    int square(int n){
        return n*n;
    }
}
public class Circle {
    Operation operation; //Aggregation
    double pi=3.14;

    double area(int radius){
        operation = new Operation();
        int rsquare=operation.square(radius); //code Reusability
        return pi*rsquare;
    }

    public static void main(String[] args) {
        Circle obj=new Circle();
        double result = obj.area(10);
        System.out.println(result);
    }
}
