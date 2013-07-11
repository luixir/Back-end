package com.bjtu.sample.entity;

// Hibernate library
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import java.math.BigDecimal;



@Entity
@Table(name = "item_detail" )
public class ItemDetail {

	@Id
	@GeneratedValue
	private long id;
	
	/**
	 * 以下参考美团网本单详情
	 */
	private String itemContent;//本单详情内容
	
	private BigDecimal price;//单价价格
	
	private int number;//数量规格
	
	private BigDecimal originalTotalPrice;//原价小计
	
	@ManyToOne
	private Item item;

	public String getitemContent() {
		return itemContent;
	}

	public void setitemContent(String itemContent) {
		this.itemContent = itemContent;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BigDecimal getOriginalTotalPrice() {
		return originalTotalPrice;
	}

	public void setOriginalTotalPrice(BigDecimal originalTotalPrice) {
		this.originalTotalPrice = originalTotalPrice;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	

}
