package PackageDog;

import PackageAnimal.Animal;

public class Dog extends Animal{
    String color = "Brown";

    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println("My dog color is = "+ dog.color);
        dog.setName("Labrador Retriever");
        System.out.println("My Dog Breed Name is = " + dog.getName());
        System.out.println("The Dogs have "+dog.ear+"ear.");

    }
}
