//Write a Java program to get a substring of a given string between two specified positions

import java.util.Scanner;
public class FindSubstring {

    public static void main(String[] args) {

        // object of scanner class for taking input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Strings = ");
        String str = sc.nextLine();

        System.out.print("Enter the startIndex = " ); // Enter the start index
        int startIndex = sc.nextInt();

        System.out.print("Enter the endIndex = "); // Enter the end index
        int endIndex = sc.nextInt();

        //Collect the substring after given indexes
        String resultString = str.substring(startIndex,endIndex);
        System.out.print("Result Strings = " + resultString);







    }
}
