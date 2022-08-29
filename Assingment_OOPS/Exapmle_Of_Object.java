/**
 * Objects : Any entity that has state and behaviour is known as an Object.
 * We can create multiple object of a class.
 * */
public class Exapmle_Of_Object {
    int x = 10; //Non-static variable
    public static void main(String[] args) {
        Exapmle_Of_Object obj = new Exapmle_Of_Object(); // Creating a object of the class by using new keyword
        System.out.println("The Value of x = " + obj.x);
    }
}
