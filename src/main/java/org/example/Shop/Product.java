package org.example.Shop;

/**
 * Класс продукта
 */
public class Product {
    private Double cost; // Стоимость продукта
    private String title; // Название

    /**
     * Конструктор продукта
     *
     * @param cost  стоимость
     * @param title название
     */
    public Product(Double cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры, сеттеры:
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            return product.getCost() == this.cost && product.getTitle().equals(this.title);
        }
        else return false;
    }
}