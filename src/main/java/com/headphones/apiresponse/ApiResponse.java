package com.headphones.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.headphones.entity.HeadPhonesEntity;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

	private String message;

	private HeadPhonesEntity headPhone;

	private List<HeadPhonesEntity> listHeadPhone;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HeadPhonesEntity getHeadPhone() {
		return headPhone;
	}

	public void setHeadPhone(HeadPhonesEntity headPhone) {
		this.headPhone = headPhone;
	}

	public List<HeadPhonesEntity> getListHeadPhone() {
		return listHeadPhone;
	}

	public void setListHeadPhone(List<HeadPhonesEntity> listHeadPhone) {
		this.listHeadPhone = listHeadPhone;
	}

}
