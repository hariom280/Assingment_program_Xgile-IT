public class Electronic extends ShopAbs implements OnlineShop{
    //Create Electronic class extends the ShopAbs abstract class and implements the OnlineShop


    @Override
    public void categoryName() {//override method from OnlineShop interface
        System.out.println("Category Name of Electronic");
    }

    @Override
    void printPrice() { //override method from ShopAbs abstract class
        System.out.println("Price of Electronic ="+getPrice());
    }
}
