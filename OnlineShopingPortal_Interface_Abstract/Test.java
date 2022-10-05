public class Test { //creating class test as main class
    public static void main(String[] args) {
        //Using lambda expression define Calculate price
        // lambda expression is used to represent the instance of functional interface Calculate
        Calculate calculate=(int price, int quantity)->price * quantity;

        // Object of Toys class
        Toys toys=new Toys();
        toys.setPrice(1000);//set the price of toys
        toys.setQuantity(5);//set the quantity of toys

        //checked if obj toys is instance of marker interface OnlineShop
        if(toys instanceof OnlineShop){
            System.out.println("Price of one Toy ="+toys.getPrice());
            System.out.println("Total toys Quantity ="+toys.getQuantity());
            //printing total price of toys
            System.out.println("Total price of toys ="+calculate.calculationOfPrice(toys.price,toys.quantity));
        }


        //Object of Cloth class
        Cloth cloth=new Cloth();
        cloth.setPrice(2500);//set the price of cloths
        cloth.setQuantity(9);//set the quantity of cloths

        //checked if obj cloth is instance of marker interface OnlineShop
        if(cloth instanceof OnlineShop){
            System.out.println("Price of one Cloth ="+cloth.getPrice());
            System.out.println("Total cloths Quantity ="+cloth.getQuantity());
            //printing total price of cloths
            System.out.println("Total price of cloths ="+calculate.calculationOfPrice(cloth.price,cloth.quantity));
        }


        //Object of Electronic class
        Electronic electronic=new Electronic();
        electronic.setPrice(90);//set price of electronic item
        electronic.setQuantity(10);//set quantity of electronic item

        //checked if obj electronic is instance of marker interface OnlineShop
        if(electronic instanceof OnlineShop){
            System.out.println("Price of one electronic item ="+electronic.getPrice());
            System.out.println("Total electronic item Quantity ="+electronic.getQuantity());
            //printing total price of electronic items
            System.out.println("Total price of electronic items ="+calculate.calculationOfPrice(electronic.price,electronic.quantity));
        }

        //Object of Western class
        Western western=new Western();
        western.setPrice(800);//set price of Western cloths
        western.setQuantity(9);//set quantity of Western cloths

        //checked if obj western is instance of marker interface OnlineShop
        if(western instanceof OnlineShop){
            System.out.println("Price of one western cloths ="+western.getPrice());
            System.out.println("Total western cloths Quantity ="+western.getQuantity());
            //printing total price of western items
            System.out.println("Total price of western cloths items ="+calculate.calculationOfPrice(western.price,western.quantity));
        }


    }
}
