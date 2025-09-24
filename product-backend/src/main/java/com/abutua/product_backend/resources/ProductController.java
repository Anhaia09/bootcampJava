package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abutua.product_backend.models.Product;

@RestController
public class ProductController {
    
    @GetMapping("product")
    public Product getProduct(){

        //Criando um objeto produto
        Product p = new Product();

        p.setId(1);
        p.setName("Notebook");
        p.setPrice(2000);

        return p;
    }


}
