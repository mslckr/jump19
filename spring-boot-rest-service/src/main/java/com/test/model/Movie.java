package com.test.model;

//Model class represents the table structure, each object represents a row.
//imports
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

//javax.persistence.Lob is depicted as unused, so this is here
@SuppressWarnings("unused")
//Entity annotation
@Entity
//Table annotation
@Table(name = "movie")
//Class
public class Movie implements Serializable {
	//Declaring serialVarsionUID
    private static final long serialVersionUID = 1L;
    
    //Primary key annotation
    @Id
    //This annotation provides generation strategy for primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    //This Specifies the column for the primary key.
    @Column(name = "id")
    
    //Variables: determines column type and name 
    private Long id;
    private String name;
    private String category;
    private String description;
    private Double price;
    private Long studio;
    private String image;
    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
 
    public Long getStudio() {
        return studio;
    }
    public void setStudio(Long studio) {
        this.studio = studio;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
