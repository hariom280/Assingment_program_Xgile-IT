/**
 * Interface : - An interface in java is blueprint of a class. The interface in java is machanism to achieve abstraction.
 * Interface is used to achieve abstraction. By using Interface we can support the functionality of multiple Inheritance.
 *
 * implements means you are using the elements of a Java Interface in your class.
 * extends means that you are creating a subclass of the base class you are extending.
 * You can only extend one class in your child class, but you can implement as many interfaces as you would like.*/

// Declaring Interface with interface keyword
interface Polygon{
    void getArea(int length, int breadth); //Method without body
}

class Rectangle implements Polygon{ // Implementing the interface here
    public void getArea(int length, int breadth){
        System.out.println("Area of rectangle is = " + (length * breadth));
    }
}
// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea(10,5);
    }
}
