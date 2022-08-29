/**
 * Interface: An interface is a completely "abstract class" that is used to group related methods with empty bodies:
 */
// Interface
interface Animals {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pigs implements Animals {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
public class Example_Of_Interface {
    public static void main(String[] args) {
        Pigs pigs = new Pigs();  // Create a Pig object
        pigs.animalSound();
        pigs.sleep();
    }
}
