package org.example;

import org.example.order.Order;
import org.example.product.Product;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = Product.populateProducts();
        List<Order> orders = Order.populateOrders();

        long streamStart = System.nanoTime();
        List<Product> noParallelProducts = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getPrice()>= 500)
                .toList();
        long streamDuration = System.nanoTime() - streamStart;

        System.out.println("========================DEFAULT STREAM=====================================");
        System.out.printf("Tempo de execução: %.3f ms%n", streamDuration / 1_000_000.0);
        //noParallelProducts.forEach(System.out::println);


        long parallelStreamStart = System.nanoTime();
        List<Product> parallelProduct = orders.parallelStream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getPrice()>=500)
                .toList();
        long parallelStreamDuration = System.nanoTime() - parallelStreamStart;

        System.out.println("========================PARALLEL STREAM=====================================");
        System.out.printf("Tempo de execução: %.3f ms%n", parallelStreamDuration / 1_000_000.0);
        //parallelProduct.forEach(System.out::println);

//
//        products.stream()
//                .filter(product -> product.getPrice()>=100)
//                .filter(product -> product.getCategory().equals("Móveis"))
//                .toList().forEach(System.out::println);
//
//        List<String> nomes = products.stream()
//                .map(Product::getName)
//                .limit(3)
//                .sorted()
//                .toList();
//
//        nomes.forEach(System.out::println);
//
//        List<Order> orders = Order.populateOrders();
//        System.out.println("============================ ORDERS ====================================");
//        orders.stream().forEach(System.out::println);
//
//        Product minProdcut = products.stream()
//                .min(Comparator.comparingDouble(Product::getPrice))
//                .orElse(null);
//
//        System.out.println("Minimum price: " + minProdcut);
//
//        Product maxProdcut = products.stream()
//                .max(Comparator.comparingDouble(Product::getPrice))
//                .orElse(null);
//
//        System.out.println("Max price: " + maxProdcut);
//
//
//        double faturamento = orders.stream()
//                .filter( order -> !order.isCancelled())
//                .flatMap( order -> order.getProducts().stream())
//                .map(Product::getPrice)
//                .reduce(0.0, Double::sum);
//
//        System.out.println("Faturamento: " + faturamento);
//
//        var soma = 0.0;
//        for (Product product : products) {
//            soma+=product.getPrice();
//        }
//
//        System.out.println("Faturamento: " + soma);
//
//
//        Map<String, Double> precoPorProduto  = orders.stream()
//                .flatMap(order -> order.getProducts().stream())
//                .collect(Collectors.toMap(
//                        Product::getName,
//                        Product::getPrice,
//                        (priceExists, newPrice) -> 5000.0
//                ));
//
//        precoPorProduto.forEach((key, value) ->
//                System.out.println(key + " - R$ " + value)
//        );
//
//        System.out.println("======================= ORDERS DEFAULT ===========================");
//        orders.stream().forEach(System.out::println);
//        System.out.println("======================= ORDERS MAP ===========================");
//        orders.stream().map(Order::getProducts).toList().forEach(System.out::println);
//        System.out.println("======================= ORDERS FLATMAP ===========================");
//        orders.stream().flatMap(order -> order.getProducts().stream()).forEach(System.out::println);
//
//
//        List<String> names = new ArrayList<>();
//
//        orders.stream()
//                .skip(1)
//                .skip(2)
//                .skip(2)
//                .skip(2)
//                .skip(2)
//                .skip(2).skip(2)
//
//                .forEach(System.out::println);




    }
}
