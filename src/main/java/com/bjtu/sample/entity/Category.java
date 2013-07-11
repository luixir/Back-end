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
	
	private String name;//��������
	
	private String picture;//����ͼƬ
	
	@OneToMany(mappedBy = "parent")
	private List<Category> subCategory;//�ӷ���
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category parent;// �������ӷ���ĸ��ࣨ���磬food��Chinese Food�ĸ��ࣩ

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
