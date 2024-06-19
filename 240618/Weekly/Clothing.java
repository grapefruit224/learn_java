public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
        calculatePrice();
    }

    public String getSize() {
        return size;
    }

    public double calculatePrice() {
        double price = getPrice();
        if (this.size == "L" || this.size == "XL" || this.size == "2XL"){
            price *= 1.1;
        }
        setPrice(price);
        return price;
    }
}
