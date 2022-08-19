public class Prg_of_Array {
    public static void main(String[] args) {
        /*
        String[] fruit = {"Apple","Banana","Papaya"};
        System.out.println(fruit[0]);
        System.out.println(fruit[1]);
        System.out.println(fruit[2]);*/

        String[] fruit = {"Apple","Banana","Papaya"};
        System.out.println(fruit[0]);
        fruit[0] = "Grapes";
        System.out.println(fruit[0]);
        System.out.println("Length of array = " + fruit.length);


        //Multidimensional Array
        int[][] myNum = { {1, 2, 3, 4}, {5, 6, 7} };
        int[][] myNum1 = { {1, 2, 3, 4}, {5, 6, 7} };

        int x = myNum[1][2];
        int y = myNum1[0][1];

        System.out.println(x);
        System.out.println(y);
        System.out.println(myNum1.length);

    }
}
