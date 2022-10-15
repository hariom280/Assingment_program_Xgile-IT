//This program about concatenate the strings

import java.util.Scanner; // Import Scanner

public class concatenateStrings {

    public static void main(String[] args) {

        // object of scanner class for taking input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the str1 = ");
        String str1 = sc.next();

        System.out.print("Enter the str2 = ");
        String str2 = sc.next();

        System.out.println("***********USE of concat()*************");
        System.out.println("The Result = " + str1.concat(str2));// concatenate the string behind first.





    }
}
