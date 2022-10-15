//This program about comparing the strings

import java.util.Scanner; //Import Scanner class for take input from users

public class StringsComparison {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); // Object of scanner class
        System.out.print("Enter the name1 = ");
        String name1 = sc.next();// Taking input and stored the variable in the name1

        System.out.print("Enter the name2 = ");
        String name2 = sc.next();// Taking input and stored the variable in the name1

        System.out.println("************************ USE of == operator **********************");
        // compare string with == equal to operator, The == operator compares references not values
        if(name1 == name2){
            System.out.println("Result of comparing two Strings with == equal to operator name1, name2 are equal");
        } else {
            System.out.println("The result is false, when strings reference are not equal");
        }

        System.out.println("************************ USE of euals() Method **********************");
        // compare string with equals() method, It compares values of string for equality
        if(name1.equals(name2)){
            System.out.println("The both values are equals.");
        } else {
            System.out.println("The values are not equal");
        }

        System.out.println("************************ USE of eualsIgnoreCase() Method **********************");
        // using of equalsIgnoreCase() method, it ignore samall letter and capital letter
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("The both values are equals, using of equalIgnoreCase() Method.");
        } else {
            System.out.println("The values are not equal");
        }

        System.out.println("************************ USE of compareTo() Method **********************");
        /**The String class compareTo() method compares values lexicographically
         *  and returns an integer value that describes if first string is less than, equal to or greater than second string.*/
        System.out.println("The compare of value with cmpareTo() method, = " + name1.compareTo(name2));

















    }


}
