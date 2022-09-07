package Assingment_OOPS;

/**
 * Inheritance : Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
 * Single Inheritance : In this part single subclass inherit the properties of the super class
 * */
class Employees{
    float salary = 20000;
}
public class Single_Inheritance extends Employees{ //Inherit the class by using extends keyword
    int bonus = 10000;
    public static void main(String[] args) {
        Single_Inheritance obj=new Single_Inheritance();
        System.out.println("Emp salary is : "+obj.salary); // Call
        System.out.println("Emp bonus is : "+obj.bonus);

    }
}
