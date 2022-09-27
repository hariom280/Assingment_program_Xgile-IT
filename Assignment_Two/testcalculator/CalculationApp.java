package testcalculator;

import assignmenttwo.calculator.Calculator;//import the package
import java.util.Scanner;

public class CalculationApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);//Scanner class object for taking input from user
        Calculator calculator=new Calculator();//Object of Calculator Class

        System.out.println("Enter the number = ");
        calculator.number1=sc.nextInt();
        calculator.number2=sc.nextInt();

        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
        calculator.modulus();

    }
}
