package com.headphones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.headphones.entity.HeadPhonesEntity;

public interface HeadPhonesRepository extends JpaRepository<HeadPhonesEntity, Integer>{

	List<HeadPhonesEntity> findAllByHeadPhoneName(String headPhoneColor);
	
	List<HeadPhonesEntity> findAllByHeadPhoneModel(String headPhoneModel);
	
	List<HeadPhonesEntity> findAllByHeadPhoneColor(String headPhoneColor);
	
	List<HeadPhonesEntity> findAllByHeadPhoneQuality(String headPhoneQuality);
	
	List<HeadPhonesEntity> findAllByHeadPhonePrice(String headPhonePrice);
	
}
