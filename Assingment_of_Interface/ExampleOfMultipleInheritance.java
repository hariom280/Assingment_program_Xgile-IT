/**
 * Multiple inheritance only possible with Interface.
 * */

interface Animal{
    void animal();
}

interface Bird{
    void bird();
}

class NewBirdAnimal implements Animal,Bird{ //Implementing multiple Inheritance
    @Override
    public void animal() {
        System.out.println("Animal can run.");
    }

    @Override
    public void bird() {
        System.out.println("Bird can fly.");
    }
}

//Main class
public class ExampleOfMultipleInheritance {
    public static void main(String[] args) {
        NewBirdAnimal nbd=new NewBirdAnimal();
        nbd.animal();
        nbd.bird();
    }
}
