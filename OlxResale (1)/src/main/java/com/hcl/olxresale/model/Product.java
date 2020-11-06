package com.hcl.olxresale.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Sathya
 *
 */
@Entity
@Table(name = "product")
public class Product {
	@Id
	private int id;
	@NotEmpty
	private int model;
	@NotEmpty
	private String feature;
	@NotEmpty
	private String description;
	@NotEmpty
	private int cost;

	public Product() {
		super();
	}

	public Product(int id, int model, String feature, String description, int cost) {
		super();
		this.id = id;
		this.model = model;
		this.feature = feature;
		this.description = description;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
