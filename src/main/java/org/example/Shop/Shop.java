package org.example.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private final List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public Shop add(Product product){
        products.add(product);
        return this;
    }

    public Shop remove(int index){
        products.remove(index);
        return this;
    }

    public Shop remove(Product product){
        products.remove(product);
        return this;
    }

    /**
     * Метод сортировки продуктов по возрастанию цены продукта
     */
    public void sortProductsByPrice() {
        products.sort(new ProductComparatorByPrice());
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        sortProductsByPrice();
        int maxElem = Collections.binarySearch(products, products.get(products.size() - 1), new ProductComparatorByPrice());
        return products.get(maxElem);
    }

    /**
     * Внутренний компаратор
     */
    private class ProductComparatorByPrice implements java.util.Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }
}