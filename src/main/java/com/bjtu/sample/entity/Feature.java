package com.bjtu.sample.entity;

//Hibernate library
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Feature" )
public class Feature {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;//特点名称(免预约等)
	
	private String featuredPicture;// 特点图片
	
	@ManyToOne
	private Item item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeaturedPicture() {
		return featuredPicture;
	}

	public void setFeaturedPicture(String featuredPicture) {
		this.featuredPicture = featuredPicture;
	}

}
