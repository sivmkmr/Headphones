package com.headphones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.headphones.apiresponse.ApiResponse;
import com.headphones.entitymodel.HeadPhonesEntityModel;
import com.headphones.service.HeadPhonesService;

@RestController
public class headphonesController {

	
	
	@Autowired
	private HeadPhonesService headPhonesService;

//	Dummy API Block

	@GetMapping("/dummy-api")
	public ResponseEntity<ApiResponse> dummyApi() {
		ApiResponse response = headPhonesService.dummyApi();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Save Data Block

	@PostMapping("/save-data")
	public ResponseEntity<ApiResponse> saveData(@RequestBody HeadPhonesEntityModel headPhonesEntityModel) {
		ApiResponse response = headPhonesService.saveData(headPhonesEntityModel);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.CREATED);
	}

//	Get All Data Block
	@GetMapping("/get-all-data")
	public ResponseEntity<ApiResponse> getAllData() {
		ApiResponse response = headPhonesService.getAllData();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.FOUND);
	}

//	Get Data By ID Block
	@GetMapping("/get-data-by-id/{id}")
	public ResponseEntity<ApiResponse> getDataById(@PathVariable("id") Integer id) {
		ApiResponse response = headPhonesService.getDataById(id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.FOUND);
	}

//	Update Data By Put Method By ID Block
	@PutMapping("/update-data-by-put/{id}")
	public ResponseEntity<ApiResponse> updateDataByPut(@RequestBody HeadPhonesEntityModel headPhonesEntityModel,
			@PathVariable("id") Integer id) {
		ApiResponse response = headPhonesService.updateDataByPut(headPhonesEntityModel, id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.CREATED);
	}

//	Update Data By Patch Method By ID Block

	@PatchMapping("/update-data-by-patch/{id}")
	public ResponseEntity<ApiResponse> updateDataByPatch(@RequestBody HeadPhonesEntityModel headPhonesEntityModel,
			@PathVariable("id") Integer id) {
		ApiResponse response = headPhonesService.updateDataByPatch(headPhonesEntityModel, id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

//	Data Deletion Block 

	@DeleteMapping("/data-delete-by-id/{id}")
	public ResponseEntity<ApiResponse> dataDeleteById(@PathVariable("id") Integer id) {
		ApiResponse response = headPhonesService.dataDeleteById(id);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.OK);
	}

}
