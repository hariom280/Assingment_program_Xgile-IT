public class Cloth extends ShopAbs implements OnlineShop{// Create Cloth class
    public void categoryName(){// override method from OnlineShop interface
        System.out.println("Category name of cloth");
    }
    void printPrice(){// override method from ShopAbs abstract class
        System.out.println("Price of cloths = "+getPrice());
    }
}
