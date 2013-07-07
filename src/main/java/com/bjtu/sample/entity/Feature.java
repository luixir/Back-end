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
	
	private String name;//�ص�����(��ԤԼ��)
	
	private String featuredPicture;// �ص�ͼƬ
	
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
