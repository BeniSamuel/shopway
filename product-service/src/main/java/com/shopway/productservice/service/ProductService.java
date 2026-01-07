package com.shopway.productservice.service;

import com.shopway.productservice.dto.request.CreateProductDTO;
import com.shopway.productservice.dto.response.ResponseProductDTO;
import com.shopway.productservice.exceptions.NotFoundException;
import com.shopway.productservice.models.Product;
import com.shopway.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ResponseProductDTO> getAllProducts () {
        return productRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private ResponseProductDTO mapToResponse (Product product) {
        return new ResponseProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    public ResponseProductDTO getProductById (String id) {
        return productRepository.findById(id).map(this::mapToResponse).orElseThrow(() -> new NotFoundException("Product not found!!!"));
    }

    public ResponseProductDTO addProduct (CreateProductDTO productDTO) {
        Product newProduct = new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice());
        return mapToResponse(productRepository.save(newProduct));
    }
}
