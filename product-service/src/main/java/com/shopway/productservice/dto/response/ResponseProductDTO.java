package com.shopway.productservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseProductDTO {
    private String id;
    private String name;
    private String description;
    private Double price;
}
