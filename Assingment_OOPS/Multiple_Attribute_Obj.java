/**
 * Multiple Attributes and Multiple objects used in a class.
 * We can use multiple object for a class.
 * */
public class Multiple_Attribute_Obj {
    //Usage Multiple Attributes
    String f_name = "Joe";
    String l_name = "Devid";
    int age = 18;

    public static void main(String[] args) {
        //Using multiple object for a class.
        Multiple_Attribute_Obj obj = new Multiple_Attribute_Obj();
        Multiple_Attribute_Obj obj1 = new Multiple_Attribute_Obj();

        System.out.println("Name : "+ obj.f_name + " " + obj.l_name);
        System.out.println("Age : "+ obj1.age);
    }

}
