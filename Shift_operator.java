public class Shift_operator {
    public static void main(String[] args) {
        //Left Shift
        int x = 10;
        int y = 2;
        int z = x << y;
        System.out.println("Left shift of x << y = " + z);

        int a = 10;
        int b = 3;
        int c = a << b;
        System.out.println("Left shift of a << b = " + c);

        //Right Shift
        int num1 = 10;
        int num2 = 2;
        int res = num1 >> num2;
        System.out.println("Right shift of num1 >> num2 = " + res);

        int n1 = 20;
        int n2 = 2;
        int r = n1 >> n2;
        System.out.println("Right shift of n1 >> n2 = " + r);

    }
}
