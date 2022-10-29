package com.headphones.secondcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.headphones.entity.HeadPhonesEntity;
import com.headphones.repository.HeadPhonesRepository;

@RestController
@RequestMapping("/second")
public class SecondController {

	@Autowired
	private HeadPhonesRepository headPhonesRepository;
	
	@GetMapping("/dummy-two")
	public String dummyTwo() {
		return "This is Second Controller Class for Testing Purpose";
	}
	
	@GetMapping("/find-by-Name/{name}")
	public List<HeadPhonesEntity> findByName(@PathVariable("name") String name) {
		return headPhonesRepository.findAllByHeadPhoneName(name);
		
	}
	
}
