package com.abutua.product_backend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abutua.product_backend.models.Product;

import jakarta.annotation.PostConstruct;

@RestController
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Mouse");
        p1.setPrice(100.00);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Capinha");
        p2.setPrice(20.00);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Carregador");
        p3.setPrice(25.00);

        products.add(p1);
        products.add(p2);
        products.add(p3);

    }

    @GetMapping("products/{id}")
    public Product getProduct(@PathVariable int id) {
        return products.get(id - 1);
    }

    @GetMapping("products")
    public List<Product> geProducts() {
        return products;
    }

}
