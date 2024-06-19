public class Clothing extends Product{
    private String size;

//    public Clothing(String name) {
//        super(name);
//    }
//
//    public Clothing(String name, double price) {
//        super(name, price);
//    }

    public Clothing(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public double calculatePrice() {
        double price = super.getPrice();
        if (this.size == "L"){
            price *= 1.1;
        }
        super.setPrice(price);
        return price;
    }
}
