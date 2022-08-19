public class Condition_nested_if {
    public static void main(String[] args) {

        //netsted if statements
        /*int x = 10;
        int y = 20;
        int z = 30;*/

        /*int x = 50;
        int y = 20;
        int z = 30;*/

        int x = 10;
        int y = 20;
        int z = 11;


        if(x < y){// When condition is  true outer if than going inside and check nested if condition.
            System.out.println("The condition is true of Outer if");

            if(y < z){
                int res = x + 500;
                System.out.println("Result of nested if = " + res);
            } else {
                System.out.println("Condition is not true in nested if");
            }
        } else {
            System.out.println("Condition is not true in outer if");
        }

    }
}
