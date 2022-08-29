/**
 * Multilevel Inheritance : When there is a chain of inheritance, it is known as multilevel inheritance.
 * */
class Employee{
    void salary(){
        System.out.println("The salay is 80000");
    }
}

class Bonus extends Employee{
    void bonus(){
        System.out.println("The bonus is 10000");
    }
}

class BonusPlus extends Bonus{
    void bonusPlus(){
        System.out.println("The Bonus Plus is 25000");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BonusPlus obj=new BonusPlus();
        obj.salary();
        obj.bonus();
        obj.bonusPlus();
    }
}
