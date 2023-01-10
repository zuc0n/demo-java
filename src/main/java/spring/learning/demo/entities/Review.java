package spring.learning.demo.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "review" )
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column( name = "user_name", length = 20 )
	private String userName;
	
	@Column( name = "short_desc", length = 50 )
	private String shortDesc;

	private int rating;
	
	private int productId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getShortDesc() {
		return shortDesc;
	}
	
	public void setId(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
}
