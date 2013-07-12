package com.bjtu.entity;

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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the subCategory
	 */
	public List<Category> getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the parent
	 */
	public Category getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Category parent) {
		this.parent = parent;
	}

}
