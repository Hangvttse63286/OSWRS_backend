package com.example.demo.payload;

import java.util.List;

public class ProductIncludeImageDTO {
	private String product_id;
	private String product_status_id;
	private String product_name;
	private String description_list;
	private String description_details;
	private String search_word;
	private long discount_id;
	List<ProductImageDTO> productImage;
	
	public ProductIncludeImageDTO ( ) {}
	
	public ProductIncludeImageDTO(String product_id, String product_status_id, String product_name,
			String description_list, String description_details, String search_word, long discount_id,
			List<ProductImageDTO> productImage) {
		this.product_id = product_id;
		this.product_status_id = product_status_id;
		this.product_name = product_name;
		this.description_list = description_list;
		this.description_details = description_details;
		this.search_word = search_word;
		this.discount_id = discount_id;
		this.productImage = productImage;
	}
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_status_id() {
		return product_status_id;
	}
	public void setProduct_status_id(String product_status_id) {
		this.product_status_id = product_status_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription_list() {
		return description_list;
	}
	public void setDescription_list(String description_list) {
		this.description_list = description_list;
	}
	public String getDescription_details() {
		return description_details;
	}
	public void setDescription_details(String description_details) {
		this.description_details = description_details;
	}
	public String getSearch_word() {
		return search_word;
	}
	public void setSearch_word(String search_word) {
		this.search_word = search_word;
	}
	public long getDiscount_id() {
		return discount_id;
	}
	public void setDiscount_id(long discount_id) {
		this.discount_id = discount_id;
	}

	public List<ProductImageDTO> getProductImage() {
		return productImage;
	}
	public void setProductImage(List<ProductImageDTO> productImage) {
		this.productImage = productImage;
	}
	

}
