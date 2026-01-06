package com.shopway.productservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(value = "product")
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @MongoId
    private String id;
    private String name;
    private String description;
    private Double price;

    public Product (String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
