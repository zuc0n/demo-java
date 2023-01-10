package spring.learning.demo.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "brand")
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 50)
	private String slug;
	
	
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
	
	public String getSlug() {
		return name;
	}
	
	public void setSlug(String slug) {
		this.slug = slug;
	}
}
