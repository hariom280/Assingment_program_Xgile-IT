package assignmenttwo.calculator; // Create a package

public class Calculator { //Calculator Class

    //Declared variable.
    public int number1;
    public int number2;

    //Non argument constructor
    public Calculator(){
        System.out.println("Non argument Constructor");
    }
    //Argument constructor with constructor overload
    public Calculator(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
    }

    //Create method for perform the different actions
    public void addition(){// This method for addition
        System.out.println("Addition Of TWO number = " + (number1+number2));
    }
    public void subtraction(){// This method for subtractions
        System.out.println("Subtraction Of TWO number = " + (number1-number2));
    }
    public void multiplication(){// This method for multiplication
        System.out.println("Multiplication Of TWO number = " + (number1*number2));
    }
    public void division(){// This method for division
        System.out.println("Division Of TWO number = " + (number1/number2));
    }
    public void modulus(){// This method for modulus
        System.out.println("Modulus Of TWO number = " + (number1%number2));
    }

}
