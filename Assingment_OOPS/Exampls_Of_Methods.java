//Example of Static methods and Non-static methods
public class Exampls_Of_Methods {

    //Static Methods called without creating any object
    static void myMethod(){
        System.out.println("Called Static Method");
    }

    //Non-static method
    public void myNonStaticMethod(){
        System.out.println("Called non-static method when it");
    }

    //Main methods
    public static void main(String[] args) {
        myMethod(); //Called Nonstatic Methods

        //create objects for call non-static method
        Exampls_Of_Methods obj=new Exampls_Of_Methods();
        obj.myNonStaticMethod();

    }
}
