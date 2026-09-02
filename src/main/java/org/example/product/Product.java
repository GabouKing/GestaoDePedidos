package org.example.product;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Product> populateProducts() {
        return List.of(
                new Product(1L, "Notebook Dell", "Eletrônicos", 4500.00),
                new Product(2L, "Mouse Logitech", "Eletrônicos", 250.00),
                new Product(3L, "Teclado Mecânico", "Eletrônicos", 450.00),
                new Product(4L, "Cadeira Gamer", "Móveis", 1200.00),
                new Product(5L, "Mesa Escritório", "Móveis", 800.00),
                new Product(6L, "Monitor 27", "Eletrônicos", 1800.00),
                new Product(7L, "Livro Java", "Livros", 120.00),
                new Product(8L, "Clean Code", "Livros", 150.00),
                new Product(9L, "Headset", "Eletrônicos", 600.00),
                new Product(10L, "Mochila", "Acessórios", 300.00)
        );
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
