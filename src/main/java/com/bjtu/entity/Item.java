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
	private Long id;//鍟嗗搧id
	
	private String name;//鍟嗗搧鍚嶇О
	
	private String mainPicture;//鍟嗗搧鍥剧墖锛堥椤典笂鍜岃缁嗕俊鎭渶椤剁澶у浘锛�
	
	private String area;//鍟嗗搧鍖哄煙锛堝晢瀹舵墍鍦ㄥ尯鍩燂紝瑗跨洿闂ㄧ瓑锛�
	
	private String shortDescription;//棣栭〉鍟嗗搧鐭殑绠�粙
	
	private String longDescription;//鍟嗗搧璇︽儏閲屽晢鍝侀暱鐨勭畝浠�
	
	private BigDecimal actualPrice;//鍟嗗搧鍘熶环
	
	private BigDecimal discountPrice;//鍟嗗搧鎶樻墸浠�
	
	private BigDecimal discount;//鎶樻墸
	
	private int consumedNumber;//娑堣垂浜烘暟
	
	private Date startDate;//璇ュ洟璐紑濮嬫椂闂�
	
	private Date endDate;//璇ュ洟璐粨鏉熸椂闂�
	
	private Date createDate;//鍥㈣喘鍒涘缓鏃堕棿

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;//鍟嗗搧鎵�睘鍟嗗鐨勫湴鍧�
	
	@ManyToOne
	private Category category;//鍟嗗搧鍒嗙被
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;//鏈崟璇︽儏
	
	@OneToMany(targetEntity = Feature.class)
	@JoinTable(name = "item_feature", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "feature_id"))
	private List<Feature> features;//鍟嗗搧鐗圭偣锛堝厤棰勭害绛夛級
	
	private String content;//鍟嗗绠�粙锛屾墍鏈変粙缁嶄竴寮犲浘鐗囷紝瀛樺偍鍥剧墖鍦板潃

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
