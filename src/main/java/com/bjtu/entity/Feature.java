package com.bjtu.entity;

//Hibernate library
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "feature" )
public class Feature {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;//特点名称(免预约等)
	
	private String featuredPicture;// 特点图片

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
	 * @return the featuredPicture
	 */
	public String getFeaturedPicture() {
		return featuredPicture;
	}

	/**
	 * @param featuredPicture the featuredPicture to set
	 */
	public void setFeaturedPicture(String featuredPicture) {
		this.featuredPicture = featuredPicture;
	}

}
