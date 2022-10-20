package com.headphones.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Table
@Entity
@Service
public class HeadPhonesEntity {

//	private HeadPhonesEntity() {
//
//	}
//
//	private static HeadPhonesEntity getObj;
//
//	public static HeadPhonesEntity getObjEntity() {
//
//		if (getObj == null) {
//			synchronized (HeadPhonesEntity.class) {
//				if (getObj == null) {
//					getObj = new HeadPhonesEntity();
//
//				}
//			}
//		}
//		return getObj;
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer headPhoneId;
	private String headPhoneName;
	private String headPhoneModel;
	private String headPhoneColor;
	private String headPhoneQuality;
	private String headPhonePrice;

	public Integer getHeadPhoneId() {
		return headPhoneId;
	}

	public void setHeadPhoneId(Integer headPhoneId) {
		this.headPhoneId = headPhoneId;
	}

	public String getHeadPhoneName() {
		return headPhoneName;
	}

	public void setHeadPhoneName(String headPhoneName) {
		this.headPhoneName = headPhoneName;
	}

	public String getHeadPhoneModel() {
		return headPhoneModel;
	}

	public void setHeadPhoneModel(String headPhoneModel) {
		this.headPhoneModel = headPhoneModel;
	}

	public String getHeadPhoneColor() {
		return headPhoneColor;
	}

	public void setHeadPhoneColor(String headPhoneColor) {
		this.headPhoneColor = headPhoneColor;
	}

	public String getHeadPhoneQuality() {
		return headPhoneQuality;
	}

	public void setHeadPhoneQuality(String headPhoneQuality) {
		this.headPhoneQuality = headPhoneQuality;
	}

	public String getHeadPhonePrice() {
		return headPhonePrice;
	}

	public void setHeadPhonePrice(String headPhonePrice) {
		this.headPhonePrice = headPhonePrice;
	}

}
