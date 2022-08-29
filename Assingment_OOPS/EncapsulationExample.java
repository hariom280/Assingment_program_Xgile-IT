/**
 * Encapsulation : The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 * Encapsulation in Java is a process of wrapping code and data together into a single unit.
 * for example, a capsule which is mixed of several medicines.
 * The get method returns the variable value, and the set method sets the value.*/

class Person{
    private String name; //Private Var resticted to access
    //Getter Method
    public String getName() {
        return name;
    }
    //Setter Method
    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Person obj=new Person();
        obj.setName("Lion"); // Set the value of the name variable to "John"
        System.out.println(obj.getName());//Get the Value
    }

}
