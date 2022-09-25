/**
 * Polymorphism : process that performs a single action in different ways.
 * Polymorphism is of two different types, compile-time polymorphism and runtime polymorphism.
 * Compile-Time polymorphism in java is also known as Static Polymorphism. to resolved at compile-time which is achieved through Method Overloading.
 * Runtime polymorphism in java is also known as Dynamic Binding which is used to call to an overridden method that is resolved dynamically at runtime rather than at compile-time.
 * */
//class Animal {
//    public void animalSound() {
//        System.out.println("The animal makes a sound");
//    }
//}
//
//class Pig extends Animal {
//    public void animalSound() {
//        System.out.println("The pig says: wee wee");
//    }
//}
//
//class Dog extends Animal {
//    public void animalSound() {
//        System.out.println("The dog says: bow wow");
//    }
//}
//public class Example_Of_Polymorphism {
//    public static void main(String[] args) {
//        Animal animal = new Animal();  // Create a Animal object
//        Animal pig = new Pig();  // Create a Pig object
//        Animal dog = new Dog();  // Create a Dog object
//        animal.animalSound();
//        pig.animalSound();
//        dog.animalSound();
//    }
//}
