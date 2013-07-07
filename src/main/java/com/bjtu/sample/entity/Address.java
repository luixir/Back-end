package com.bjtu.sample.entity;

//Hibernate library
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "Address" )
public class Address {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;//商家名称
	
	private String addressDetail;// 商家详细地址
	
	private String phone;// 商家联系电话（预约或者咨询等）
	
	private String methodToThere;// 交通方式,地铁，公交等

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMethodToThere() {
		return methodToThere;
	}
	
	public void setMethodToThere(String methodToThere) {
		this.methodToThere = methodToThere;
	}

}
