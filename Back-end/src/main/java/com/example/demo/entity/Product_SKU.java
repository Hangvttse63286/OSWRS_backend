package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "product_sku", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Product_SKU {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private int stock;
	private int sale_limit;
	private String size;
	private float price;
	private boolean is_deleted;
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
	public long getProduct_sku_id() {
		return product_sku_id;
	}
	public void setProduct_sku_id(long product_sku_id) {
		this.product_sku_id = product_sku_id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
=======
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id") 
	@OnDelete(action = OnDeleteAction.CASCADE)
    private Products products;
	
	//, referencedColumnName="product_id"
	public Product_SKU() {	
	}
	
	public Product_SKU(long id, int stock, int sale_limit, String size, float price, boolean is_deleted, Products products) {	
		this.id= id;
		this.stock= stock;
		this.sale_limit= sale_limit;
		this.size= size;
		this.price= price;
		this.is_deleted= is_deleted;
		this.products= products;
	}
	
	public Products getProducts() {
		return products;
	}
	public float getPrice() {
		return price;
	}

	public int getSale_limit() {
		return sale_limit;
	}
	public String getSize() {
		return size;
>>>>>>> Stashed changes
	}
	public int getStock() {
		return stock;
	}
<<<<<<< Updated upstream
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSale_limit() {
		return sale_limit;
=======
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
>>>>>>> Stashed changes
	}
	public void setSale_limit(int sale_limit) {
		this.sale_limit = sale_limit;
	}
<<<<<<< Updated upstream
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}


=======
	public void setSize(String size) {
		this.size = size;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
>>>>>>> Stashed changes
>>>>>>> Stashed changes
}
