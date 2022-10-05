public class Western extends ShopAbs implements OnlineShop{
    //Create Sports class extends the ShopAbs abstract class

    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("The Category name is Western");// Dispaly the category name Western of cloth
    }

    @Override
    void printPrice() {//override method from ShopAbs abstract class
        System.out.println("Price of the Western ="+getPrice());// Display the price
    }
}
