package com.headphones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.headphones.entity.HeadPhonesEntity;

public interface HeadPhonesRepository extends JpaRepository<HeadPhonesEntity, Integer>{

}
