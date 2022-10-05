public class Toys extends ShopAbs implements OnlineShop{
    //Create Toy class extends the ShopAbs abstract class and implements the OnlineShop


    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("The Category name of Toys"); //display the category name of toys
    }

    @Override
    void printPrice() {//override method from ShopAbs abstract class
        System.out.println("The price of toys ="+getPrice()); //printing the price of toys
    }
}
