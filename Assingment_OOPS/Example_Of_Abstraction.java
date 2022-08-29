/**
 * Abstraction : Abstraction is a process which displays only the information needed and hides the unnecessary information.
 * We can say that the main purpose of abstraction is data hiding.
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */
// Abstract class
abstract class AnimalNew {
    // Abstract method does not have a body.
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Buffalo extends AnimalNew {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Buffalo says: waa waa");
    }
}

//Main Class
public class Example_Of_Abstraction {
    public static void main(String[] args) {
        Buffalo buffalo = new Buffalo(); // Create a Pig object
        buffalo.animalSound();
        buffalo.sleep();
    }
}
