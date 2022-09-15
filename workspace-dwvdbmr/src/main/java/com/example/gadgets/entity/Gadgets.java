package com.example.gadgets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table( name = "Gadgets")
public class Gadgets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private Integer id;
	
	@Column
	@NotNull
	private String itemName;
	
	@Column
	@NotNull
	private String brandName;
	
	@Column
	@NotNull
	private Integer units;
	
	@Column
	@NotNull
	private Double price;
	
	
	public Gadgets(String itemName, String brandName, Integer units, Double price) {
		super();
		this.itemName = itemName;
		this.brandName = brandName;
		this.units = units;
		this.price = price;
	}

	public Gadgets() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", itemName=" + itemName + ", brandName=" + brandName + ", units=" + units
				+ ", price=" + price + "]";
	}
	
}
