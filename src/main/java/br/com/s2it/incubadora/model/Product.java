package br.com.s2it.incubadora.model;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by root on 10/08/15.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Product() {
		
	}
	
	public Product(int id) {
		this.id = id;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public BigDecimal getPrice(){
        return price;
    }
}
