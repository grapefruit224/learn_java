public class Food extends Product{
    private int expirationDate;

//    public Food(String name) {
//        super(name);
//    }
//
//    public Food(String name, double price) {
//        super(name, price);
//    }

    public Food(String name, double price, int stock, int expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    public double calculatePrice() {
        double price = super.getPrice();
        if (this.expirationDate <= 7){
            price *= 0.8;
        }
        super.setPrice(price);
        return price;
    }
}
