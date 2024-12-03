package com.app.sales.controller.dto;

/**
 * productdto.
 *
 * @param productId the productid
 * @param name the name
 * @param quantity the quantity
 * @param price the price
 */
public record ProductDto(
    String productId,
    String name,
    Integer quantity,
    Double price
) {

  /**
   * toentity.
   *
   * @param product the product
   * @return product
   */
  public static ProductDto fromEntity(ProductDto product) {
    return new ProductDto(
        product.productId(),
        product.name(),
        product.quantity(),
        product.price()
    );
  }
}