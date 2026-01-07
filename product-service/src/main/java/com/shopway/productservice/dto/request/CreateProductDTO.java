package com.shopway.productservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateProductDTO {
    private String name;
    private String description;
    private Double price;
}
