package com.app.sales.entity;

import com.app.sales.controller.dto.ProductDto;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * sales.
 */
@Document(collection = "sales")
public class Sales {

  @Id
  private ObjectId saleId;
  private LocalDate saleDate;
  private String clientId;
  private List<ProductDto> listProduct;
  private Double totalPrice;
  private String paymentMethod;
  private String saleStatus;
  private String addressOfSend;
  private Double descountApply;
  private Double tax;

  public Sales() {}

  /**
   * sales.
   *
   * @param saleId the salesid
   * @param saleDate the salesdate
   * @param clientId the clientid
   * @param listProduct the listproduct
   * @param totalPrice the totalprice
   * @param paymentMethod the paymentmethod
   * @param saleStatus the salesstatus
   * @param addressOfSend the addressofsend
   * @param descountApply the descountapply
   * @param tax the tax
   */
  public Sales(ObjectId saleId, LocalDate saleDate, String clientId,
               List<ProductDto> listProduct, Double totalPrice,
               String paymentMethod,
               String saleStatus, String addressOfSend, Double descountApply,
               Double tax) {
    this.saleId = saleId;
    this.saleDate = saleDate;
    this.clientId = clientId;
    this.listProduct = listProduct;
    this.totalPrice = totalPrice;
    this.paymentMethod = paymentMethod;
    this.saleStatus = saleStatus;
    this.addressOfSend = addressOfSend;
    this.descountApply = descountApply;
    this.tax = tax;

  }

  public ObjectId getSaleId() {
    return saleId;
  }

  public void setSaleId(ObjectId saleId) {
    this.saleId = saleId;
  }

  public LocalDate getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(LocalDate saleDate) {
    this.saleDate = saleDate;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public List<ProductDto> getListProduct() {
    return listProduct;
  }

  public void setListProduct(List<ProductDto> listProduct) {
    this.listProduct = listProduct;
  }

  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getSaleStatus() {
    return saleStatus;
  }

  public void setSaleStatus(String saleStatus) {
    this.saleStatus = saleStatus;
  }

  public String getAddressOfSend() {
    return addressOfSend;
  }

  public void setAddressOfSend(String addressOfSend) {
    this.addressOfSend = addressOfSend;
  }

  public Double getDescountApply() {
    return descountApply;
  }

  public void setDescountApply(Double descountApply) {
    this.descountApply = descountApply;
  }

  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sales sale = (Sales) o;
    return Objects.equals(saleId, sale.saleId)
        && Objects.equals(saleDate, sale.saleDate)
        && Objects.equals(clientId, sale.clientId)
        && Objects.equals(listProduct, sale.listProduct)
        && Objects.equals(totalPrice, sale.totalPrice)
        && Objects.equals(paymentMethod, sale.paymentMethod)
        && Objects.equals(saleStatus, sale.saleStatus)
        && Objects.equals(addressOfSend, sale.addressOfSend)
        && Objects.equals(descountApply, sale.descountApply)
        && Objects.equals(tax, sale.tax);
  }
}
