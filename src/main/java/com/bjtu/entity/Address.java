package com.bjtu.entity;

//Hibernate library
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "address" )
public class Address {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;//商家名称
	
	private String addressDetail;// 商家详细地址
	
	private String phone;// 商家联系电话（预约或者咨询等）
	
	private String methodToThere;// 交通方式,地铁，公交等	

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
	 * @return the addressDetail
	 */
	public String getAddressDetail() {
		return addressDetail;
	}

	/**
	 * @param addressDetail the addressDetail to set
	 */
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the methodToThere
	 */
	public String getMethodToThere() {
		return methodToThere;
	}

	/**
	 * @param methodToThere the methodToThere to set
	 */
	public void setMethodToThere(String methodToThere) {
		this.methodToThere = methodToThere;
	}



}
