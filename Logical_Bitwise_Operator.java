public class Logical_Bitwise_Operator {
    public static void main(String[] args) {
        int x = 100;
        int y = 50;
        int z = 200;
        //Logical AND(&&)
        System.out.println("Logical && = "+(x<y && x<z));//It's doesn't checking second condition when first is false.
        System.out.println("Logical || = "+(x>y || x<z));// It's doesn't checking second condition when first is true.

        //Bitwise AND(&)
        System.out.println("Bitwise & = "+(x<y & x<z));
        //It's checking both condition whether first is false or true.
        System.out.println("Bitwise | = "+(x>y | x<z));//It's always check both condition.

        //NOT(!)
        System.out.println("NOT ! = "+!(x>y | x<z));//not(!) operator always reverse the result

    }
}
