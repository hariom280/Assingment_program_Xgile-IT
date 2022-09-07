/**
 * Loop: loops are used to repeat a block of code.
 * In java there mainly three types of Loop
 * for loop ,foreach loop
 * while loop
 * do while loop
 * Using loop With interface example.*/
import java.util.*;
interface Table{
    void printTable(int num);
}

class NewTable implements Table{//Implement the Table , Talble is interface
    public void printTable(int num){
        for(int i=1; i<=10; i++){ //Using loop
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
//Main class
public class ExampleOfInterfaceLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number what you want table = ");
        int res=sc.nextInt();
        NewTable nt=new NewTable();
        nt.printTable(res);
    }
}
