package spring.learning.demo.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "product" )
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column( length = 20 )
	private String name;
	
	@Column( name = "short_desc", length = 50 )
	private String shortDesc;
	
	private double price;
	
	private long stock;
	
	private int sold;
	
	private int brandId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDesc() {
		return shortDesc;
	}
	
	public void setId(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public long getStock() {
		return stock;
	}
	
	public void setStock(long stock) {
		this.stock = stock;
	}
	
	public int getSold() {
		return sold;
	}
	
	public void setSold(int sold) {
		this.sold = sold;
	}
}
