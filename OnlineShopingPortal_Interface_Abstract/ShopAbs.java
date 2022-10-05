abstract class ShopAbs implements Shop{// Create ShopAbs as abstract class and implements Shop interface
    //Declare two variable of int type
    int price;
    int quantity;

    abstract void printPrice(); // Create one method abstract type

    public int getPrice(){ // get the price
        return price;
    }

    public void setPrice(int price){ // set the price
        this.price=price;
    }

    public int getQuantity(){ // Using this method get the quantity
        return quantity;
    }

    public void setQuantity(int quantity){ // Using this method set the quantity
        this.quantity=quantity;
    }
}
