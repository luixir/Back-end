package com.bjtu.sample.entity;

//Hibernate library
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.List;


@Entity
@Table(name = "category" )
public class Category {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;//分类名称
	
	private String picture;//分类图片
	
	@OneToMany(mappedBy = "parent")
	private List<Category> subCategory;//子分类
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category parent;// 分类是子分类的父类（例如，food是Chinese Food的父类）

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<Category> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

}
