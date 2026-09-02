package org.example.order;

import org.example.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private String cliente;
    private List<Product> Products;
    private boolean isCancelled;

    public Order(Long id, String cliente, List<Product> products, boolean isCancelled) {
        this.id = id;
        this.cliente = cliente;
        Products = products;
        this.isCancelled = isCancelled;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public List<Product> getProducts() { return Products; }
    public void setProducts(List<Product> Products) { this.Products = Products; }
    public boolean isCancelled() { return isCancelled; }
    public void setCancelled(boolean cancelled) { isCancelled = cancelled; }

    public static List<Order> populateOrders() {
        List<Product> products = Product.populateProducts();
        String[] clients = {"Gabriel", "Maria", "João", "Ana", "Carlos"};

        List<Order> orders = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            orders.add(new Order(
                    (long) i + 1,
                    clients[i % clients.length],
                    List.of(products.get(i), products.get((i + 1) % products.size())),
                    i % 5 == 2 || i % 5 == 4
            ));
        }
        return orders;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", cliente='" + cliente + '\'' +
                ", Products=" + Products + ", isCancelled=" + isCancelled + '}';
    }
}
