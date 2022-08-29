/**
 * Super : The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * This keyword can also be used to invoke the parent class constructor.
 * */

class EmployeeNew{
    void salary(){
        System.out.println("The salary is 20000.");
    }
}

class JuniorEmp extends EmployeeNew{
    void salary(){
        System.out.println("The salary is 30000");
    }

    void bonus(){
        System.out.println("The bonus is 10000");
    }

    void work(){
        super.salary();
        bonus();
    }
}
//Main Class
public class Example_Of_Super {
    public static void main(String[] args) {
        JuniorEmp obj=new JuniorEmp();
        obj.work();
    }
}
