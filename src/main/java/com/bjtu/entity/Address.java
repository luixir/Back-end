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
	private Long id;
	
	private String name;//鍟嗗鍚嶇О
	
	private String addressDetail;// 鍟嗗璇︾粏鍦板潃
	
	private String phone;// 鍟嗗鑱旂郴鐢佃瘽锛堥绾︽垨鑰呭挩璇㈢瓑锛�
	
	private String methodToThere;// 浜ら�鏂瑰紡,鍦伴搧锛屽叕浜ょ瓑	

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
