package br.com.s2it.incubadora.model;

import javax.persistence.*;

import java.io.Serializable;


/**
 * Created by root on 10/08/15.
 */
@Entity
@Table(name = "product")
public class Client implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Client() {
		
	}
	
	public Client(int id) {
		this.id = id;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;
    
    @Column(name="surname")
    private String surname;
    
    @Column(name="age")
    private int age;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
    }
