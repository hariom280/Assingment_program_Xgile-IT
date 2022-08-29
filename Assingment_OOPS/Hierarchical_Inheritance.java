/**
 * Hierarchical Inheritance : When two or more classes inherits a single class, it is known as hierarchical inheritance.
 * */

class Vehicle{
    void modelName(){
        System.out.println("The Model Name is : Hero, Kawasaki, Yamaha");
    }
}

class Bike extends Vehicle{
    void twoWheels(){
        System.out.println("The Bike have 2 wheels");
    }
}

class Car extends Vehicle{
    void fourWheels(){
        System.out.println("The Car have 4 wheels");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Car obj=new Car();
        obj.modelName();
        obj.fourWheels();

        Bike obj1=new Bike();
        obj1.twoWheels();
    }
}
