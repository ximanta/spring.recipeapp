package com.arvin.spring.recipapp.spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catagory {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String description;

	/*
	 * @ManyToMany(mappedBy = "catagories") private Set<Recipe> recipe;
	 */

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

	/*
	 * public Set<Recipe> getRecipe() { return recipe; }
	 * 
	 * public void setRecipe(Set<Recipe> recipe) { this.recipe = recipe; }
	 */


}
