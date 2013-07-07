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
	
	private String name;//�̼�����
	
	private String addressDetail;// �̼���ϸ��ַ
	
	private String phone;// �̼���ϵ�绰��ԤԼ������ѯ�ȣ�
	
	private String methodToThere;// ��ͨ��ʽ,������������

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
