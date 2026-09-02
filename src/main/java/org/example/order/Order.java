package org.example.order;


import org.example.product.Product;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> Products) {
        this.Products = Products;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public static List<Order> populateOrders() {

        List<Product> Products = Product.populateProducts();

        return List.of(
                new Order(
                        1L,
                        "Gabriel",
                        List.of(
                                Products.get(0),
                                Products.get(1)
                        ),
                        false
                ),

                new Order(
                        2L,
                        "Maria",
                        List.of(
                                Products.get(3),
                                Products.get(4)
                        ),
                        false
                ),

                new Order(
                        3L,
                        "João",
                        List.of(
                                Products.get(6),
                                Products.get(7)
                        ),
                        true
                ),

                new Order(
                        4L,
                        "Ana",
                        List.of(
                                Products.get(2),
                                Products.get(5),
                                Products.get(8)
                        ),
                        false
                ),

                new Order(
                        5L,
                        "Carlos",
                        List.of(
                                Products.get(1),
                                Products.get(9)
                        ),
                        true
                )
        );
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", Products=" + Products +
                ", isCancelled=" + isCancelled +
                '}';
    }
}
