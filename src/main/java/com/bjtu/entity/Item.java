package com.bjtu.entity;

//Hibernate library
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "item" )
public class Item {

	@Id
	@GeneratedValue
	private long id;//商品id
	
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
	
	private Date createDate;//团购创建时间

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;//商品所属商家的地址
	
	@ManyToOne
	private Category category;//商品分类
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;//本单详情
	
	@OneToMany(targetEntity = Feature.class)
	@JoinTable(name = "item_feature", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "feature_id"))
	private List<Feature> features;//商品特点（免预约等）
	
	private String content;//商家简介，所有介绍一张图片，存储图片地址

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
	 * @return the mainPicture
	 */
	public String getMainPicture() {
		return mainPicture;
	}

	/**
	 * @param mainPicture the mainPicture to set
	 */
	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	/**
	 * @return the actualPrice
	 */
	public BigDecimal getActualPrice() {
		return actualPrice;
	}

	/**
	 * @param actualPrice the actualPrice to set
	 */
	public void setActualPrice(BigDecimal actualPrice) {
		this.actualPrice = actualPrice;
	}

	/**
	 * @return the discountPrice
	 */
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	/**
	 * @param discountPrice the discountPrice to set
	 */
	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	/**
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 * @return the consumedNumber
	 */
	public int getConsumedNumber() {
		return consumedNumber;
	}

	/**
	 * @param consumedNumber the consumedNumber to set
	 */
	public void setConsumedNumber(int consumedNumber) {
		this.consumedNumber = consumedNumber;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the itemDetails
	 */
	public List<ItemDetail> getItemDetails() {
		return itemDetails;
	}

	/**
	 * @param itemDetails the itemDetails to set
	 */
	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	/**
	 * @return the features
	 */
	public List<Feature> getFeatures() {
		return features;
	}

	/**
	 * @param features the features to set
	 */
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
