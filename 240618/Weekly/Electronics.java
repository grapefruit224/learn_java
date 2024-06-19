public class Electronics extends Product{
    private String brand;

//    public Electronics(String name) {
//        super(name);
//    }
//
//    public Electronics(String name, double price) {
//        super(name, price);
//    }

    public Electronics(String name, double price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    public double calculatePrice() {
        double price = super.getPrice();
        if (this.brand == "Apple"){
            price *= 1.2;
        }
        super.setPrice(price);
        return price;
    }
}
