public class PremiumShoppingMall extends ShoppingMall {
    public PremiumShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability() {
        Product[] products = getProducts();
        int count = getCount();
        for(int i = 0; i<count; i++) {
            if (products[i].getStock() < 10) return false;
        }
        return true;
    }
}
