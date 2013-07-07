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
	private int id;//��Ʒid
	
	private String name;//��Ʒ����
	
	private String mainPicture;//��ƷͼƬ����ҳ�Ϻ���ϸ��Ϣ��˴�ͼ��
	
	private String area;//��Ʒ�����̼�����������ֱ�ŵȣ�
	
	private String shortDescription;//��ҳ��Ʒ�̵ļ��
	
	private String longDescription;//��Ʒ��������Ʒ���ļ��
	
	private BigDecimal actualPrice;//��Ʒԭ��
	
	private BigDecimal discountPrice;//��Ʒ�ۿۼ�
	
	private BigDecimal discount;//�ۿ�
	
	private int consumedNumber;//��������
	
	private Date startDate;//���Ź���ʼʱ��
	
	private Date endDate;//���Ź�����ʱ��
	
	private Date createDate;

	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;//��Ʒ�����̼ҵĵ�ַ
	
	@ManyToOne
	private Category category;//��Ʒ����
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;//��������
	
	@OneToMany(mappedBy = "item")
	private List<Feature> features;//��Ʒ�ص㣨��ԤԼ�ȣ�
	
	private String content;//�̼Ҽ�飬���н���һ��ͼƬ���洢ͼƬ��ַ

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
