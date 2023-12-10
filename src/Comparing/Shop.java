package Comparing;

public class Shop {
    String shop;

    public Shop(String shop) {
        this.shop = shop;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", 3.90);
        Product product2 = new Product("Mleko", 3.90);
        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));
        System.out.println("ale".equals("ale"));


        Shop shop1 = new Shop("tak");
        Shop shop2 = new Shop("tak");

        System.out.println(shop1.equals(shop2));



    }
}
