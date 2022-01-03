package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Sales implements Serializable {

	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String SaleId, OrderNumber, ProductId, CustomerId, CurrencyId;
	private String SalesChannel;
	private String Netamt, Tax, ShippingCost, GrossAmt;

	@OneToMany(cascade = CascadeType.ALL)
	private Currencies currencies;

	@OneToMany(cascade = CascadeType.ALL)
	private Products products;

	public String getSaleId() {
		return SaleId;
	}

	public void setSaleId(String saleId) {
		SaleId = saleId;
	}

	public String getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getCurrencyId() {
		return CurrencyId;
	}

	public void setCurrencyId(String currencyId) {
		CurrencyId = currencyId;
	}

	public String getSalesChannel() {
		return SalesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		SalesChannel = salesChannel;
	}

	public String getNetamt() {
		return Netamt;
	}

	public void setNetamt(String netamt) {
		Netamt = netamt;
	}

	public String getTax() {
		return Tax;
	}

	public void setTax(String tax) {
		Tax = tax;
	}

	public String getShippingCost() {
		return ShippingCost;
	}

	public void setShippingCost(String shippingCost) {
		ShippingCost = shippingCost;
	}

	public String getGrossAmt() {
		return GrossAmt;
	}

	public void setGrossAmt(String grossAmt) {
		GrossAmt = grossAmt;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CurrencyId, CustomerId, GrossAmt, Netamt, OrderNumber, ProductId, SaleId, SalesChannel,
				ShippingCost, Tax, currencies, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sales other = (Sales) obj;
		return Objects.equals(CurrencyId, other.CurrencyId) && Objects.equals(CustomerId, other.CustomerId)
				&& Objects.equals(GrossAmt, other.GrossAmt) && Objects.equals(Netamt, other.Netamt)
				&& Objects.equals(OrderNumber, other.OrderNumber) && Objects.equals(ProductId, other.ProductId)
				&& Objects.equals(SaleId, other.SaleId) && Objects.equals(SalesChannel, other.SalesChannel)
				&& Objects.equals(ShippingCost, other.ShippingCost) && Objects.equals(Tax, other.Tax)
				&& Objects.equals(currencies, other.currencies) && Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "Sales [SaleId=" + SaleId + ", OrderNumber=" + OrderNumber + ", ProductId=" + ProductId + ", CustomerId="
				+ CustomerId + ", CurrencyId=" + CurrencyId + ", SalesChannel=" + SalesChannel + ", Netamt=" + Netamt
				+ ", Tax=" + Tax + ", ShippingCost=" + ShippingCost + ", GrossAmt=" + GrossAmt + ", currencies="
				+ currencies + ", products=" + products + "]";
	}

}
