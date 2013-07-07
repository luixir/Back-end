package com.bjtu.sample.entity;

//Hibernate library
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.math.BigDecimal;
import java.util.*;


@Entity
@Table(name = "Item" )
public class Item {

	@Id
	@GeneratedValue
	private int id;//商品id
	
	private String name;//商品名称
	
	private String mainPicture;//商品图片（首页上和详细信息最顶端大图）
	
	private String area;//商品区域（商家所在区域，西直门等）
	
	private String shortDescription;//首页商品短的简介
	
	private String longDescription;//商品详情里商品长的简介
	
	private BigDecimal actualPrice;//商品原价
	
	private BigDecimal discountPrice;//商品折扣价
	
	private BigDecimal discount;//折扣
	
	private int consumedNumber;//消费人数
	
	private Date startDate;//该团购开始时间
	
	private Date endDate;//该团购结束时间
	
	private Date createDate;

	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;//商品所属商家的地址
	
	@ManyToOne
	private Category category;//商品分类
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;//本单详情
	
	@OneToMany(mappedBy = "item")
	private List<Feature> features;//商品特点（免预约等）
	
	private String content;//商家简介，所有介绍一张图片，存储图片地址

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return mainPicture;
	}

	public void setPicture(String picture) {
		this.mainPicture = picture;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLong_description() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public BigDecimal getPrice() {
		return actualPrice;
	}

	public void setPrice(BigDecimal price) {
		this.actualPrice = price;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscount_price(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public int getConsumedNumber() {
		return consumedNumber;
	}

	public void setConsumedNumber(int consumedNumber) {
		this.consumedNumber = consumedNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStart_date(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<ItemDetail>getItemDetail() {
		return itemDetails;
	}

	public void setOrderDetail(List<ItemDetail> itemDetail) {
		this.itemDetails = itemDetail;
	}
	
	
	public List<Feature> getFeature() {
		return features;
	}

	public void setFeature(List<Feature> feature) {
		this.features = feature;
	}
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
