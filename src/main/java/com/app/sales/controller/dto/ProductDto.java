package com.app.sales.controller.dto;

public record ProductDto(
    String productId,
    String name,
    Integer quantity,
    Double price
) {
  public static ProductDto fromEntity(ProductDto product) {
    return new ProductDto(
        product.productId(),
        product.name(),
        product.quantity(),
        product.price()
    );
  }
}