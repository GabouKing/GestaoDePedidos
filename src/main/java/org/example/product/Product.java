package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

    public Product(Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public static List<Product> populateProducts() {
        String[] names = {"Notebook Dell", "Mouse Logitech", "Teclado Mecânico", "Cadeira Gamer",
                "Mesa Escritório", "Monitor 27", "Livro Java", "Clean Code", "Headset", "Mochila"};
        String[] categories = {"Eletrônicos", "Eletrônicos", "Eletrônicos", "Móveis", "Móveis",
                "Eletrônicos", "Livros", "Livros", "Eletrônicos", "Acessórios"};
        double[] prices = {4500.00, 250.00, 450.00, 1200.00, 800.00,
                1800.00, 120.00, 150.00, 600.00, 300.00};

        List<Product> products = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            int model = i % names.length;
            products.add(new Product((long) i + 1, names[model] + " " + (i + 1),
                    categories[model], prices[model]));
        }
        return products;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' +
                ", category='" + category + '\'' + ", price=" + price + '}';
    }
}
