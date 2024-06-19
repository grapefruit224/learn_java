public abstract class ShoppingMall {
    private Product[] products;
    private int count;

    public ShoppingMall(int size) {
        products = new Product[size];
        count = 0;
    }

    public Product[] getProducts() {
        return products;
    }
    public int getCount() {
        return count;
    }

    public void addProduct(Product product) {
        if (count >= products.length) {
            expandArray();
        }
        products[count++] = product;
    }

    public void removeProduct(Product product) {
        int index = findProductIndex(product);
        if (index >= 0) {
            removeProductAtIndex(index);
        }
    }

    public void removeProduct(String productName) {
        int index = findProductIndex(productName);
        if (index >= 0) {
            removeProductAtIndex(index);
        }
    }

    public void displayProducts() {
        for (int i = 0; i < count; i++) {

            System.out.printf("상품명:%s 가격:%.1f 재고량:%d ", products[i].getName(), products[i].getPrice(), products[i].getStock());
            if (products[i] instanceof Clothing) {
                Clothing clothing = (Clothing) products[i];
                System.out.printf("사이즈:" + clothing.getSize());
            }
            else if(products[i] instanceof Electronics) {
                Electronics electronics = (Electronics) products[i];
                System.out.printf("브랜드:" + electronics.getBrand());
            }
            else if (products[i] instanceof Food) {
                Food food = (Food) products[i];
                System.out.printf("유통기한:" + food.getExpirationDate());
            }
            System.out.println();

        }
    }

    private void expandArray() {
        Product[] newProducts = new Product[products.length * 2];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    private int findProductIndex(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(product)) {
                return i;
            }
        }
        return -1;
    }

    private int findProductIndex(String productName) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(productName)) {
                return i;
            }
        }
        return -1;
    }

    private void removeProductAtIndex(int index) {
        for (int i = index; i < count - 1; i++) {
            products[i] = products[i + 1];
        }
        products[--count] = null;
    }

    public abstract boolean checkOrderAvailability();

}
