package org.example.Shop;

import org.assertj.core.api.Assertions;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop
                .add(new Product(50.0, "Water"))
                .add(new Product(124.23, "Tea"))
                .add(new Product(56.0, "Bread"))
                .add(new Product(140.54, "Chocolate"))
                .add(new Product(55.0, "Milk"));

        getMostExpensiveProductTest(shop);
        sortProductsByPriceTest(shop);
    }

    public static void getMostExpensiveProductTest(Shop shop){
        shop.sortProductsByPrice();

        Assertions.assertThat(shop
                .getProducts())
                .isNotEmpty()
                .hasSize(5)
                .doesNotHaveDuplicates()
                .extracting(Product::getTitle)
                .containsSequence("Water", "Milk", "Bread", "Tea", "Chocolate");
    }

    public static void sortProductsByPriceTest(Shop shop){
        Assertions.assertThat(shop.getMostExpensiveProduct()).isEqualTo(new Product(140.54, "Chocolate"));
    }
}