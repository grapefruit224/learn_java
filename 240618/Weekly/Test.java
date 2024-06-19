
public class Test {
    public static void main(String[] args) {
        PremiumShoppingMall premiumShopping = new PremiumShoppingMall(5);
        Food waterMelon = new Food("수박", 25000, 21, 10);
        premiumShopping.addProduct(new Product("상의", 10000, 11));
        premiumShopping.addProduct(new Clothing("반팔", 30000, 10, "L"));
        premiumShopping.addProduct(new Electronics("iPhone16", 1500000, 40, "Apple"));
        premiumShopping.addProduct(waterMelon);
        premiumShopping.addProduct(new Food("떡볶이", 18000, 10, 5));
        System.out.println("premiumShopping 원래 배열 길이 -> " + premiumShopping.getProducts().length);
        System.out.println("상품 추가");
        premiumShopping.addProduct(new Clothing("원피스", 28000, 10, "M"));

        System.out.println("각 상품들의 calculatePrice() 확인");
        for(int i=0; i<premiumShopping.getCount();i++){
            System.out.println(premiumShopping.getProducts()[i].calculatePrice());
        }
        System.out.println();

        System.out.println("Products 배열 늘어난 것 확인 -> " + premiumShopping.getProducts().length);
        System.out.println();

        System.out.println("checkOrderAvailability() 작동 확인 -> " + premiumShopping.checkOrderAvailability());
        System.out.println();

        System.out.println("stock 수정 후 작동 확인");
        waterMelon.setStock(7);
        System.out.println(premiumShopping.checkOrderAvailability());
        System.out.println();

        System.out.println("\ndisplayProducts() 실행 확인");
        premiumShopping.displayProducts();

        System.out.println("\n배열 삭제 확인");
        System.out.println("Product 객체로 삭제");
        premiumShopping.removeProduct(waterMelon);
        premiumShopping.displayProducts();
        System.out.println("\n상품명으로 삭제");
        premiumShopping.removeProduct("원피스");
        premiumShopping.displayProducts();

    }
}
