package com.bjtu.entity;

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
	 * @return the itemContent
	 */
	public String getItemContent() {
		return itemContent;
	}

	/**
	 * @param itemContent the itemContent to set
	 */
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the originalTotalPrice
	 */
	public BigDecimal getOriginalTotalPrice() {
		return originalTotalPrice;
	}

	/**
	 * @param originalTotalPrice the originalTotalPrice to set
	 */
	public void setOriginalTotalPrice(BigDecimal originalTotalPrice) {
		this.originalTotalPrice = originalTotalPrice;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	

}
