package com.bjtu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	private int huluId;
	
	private String weiboId;
	
	private String weiboName;
	
	private int credit;

	/**
	 * @return the huluId
	 */
	public int getHuluId() {
		return huluId;
	}

	/**
	 * @param huluId the huluId to set
	 */
	public void setHuluId(int huluId) {
		this.huluId = huluId;
	}

	/**
	 * @return the weiboId
	 */
	public String getWeiboId() {
		return weiboId;
	}

	/**
	 * @param weiboId the weiboId to set
	 */
	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}

	/**
	 * @return the weiboName
	 */
	public String getWeiboName() {
		return weiboName;
	}

	/**
	 * @param weiboName the weiboName to set
	 */
	public void setWeiboName(String weiboName) {
		this.weiboName = weiboName;
	}

	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
}
