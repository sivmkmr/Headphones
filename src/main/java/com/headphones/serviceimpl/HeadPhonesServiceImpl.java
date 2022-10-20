package com.headphones.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.headphones.apiresponse.ApiResponse;
import com.headphones.entity.HeadPhonesEntity;
import com.headphones.entitymodel.HeadPhonesEntityModel;
import com.headphones.globalconstant.GlobalConstant;
import com.headphones.repository.HeadPhonesRepository;
import com.headphones.service.HeadPhonesService;

@Service
public class HeadPhonesServiceImpl implements HeadPhonesService {

//	private HeadPhonesEntity headPhonesEntity = HeadPhonesEntity.getObjEntity();

	HeadPhonesEntity headPhonesEntity = new HeadPhonesEntity();

	@Autowired
	private HeadPhonesRepository headPhonesRepository;

//	Dummy API Block

	@Override
	public ApiResponse dummyApi() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(GlobalConstant.dummyApi);
		return apiResponse;
	}

//	Data Insertion Block

	@Override
	public ApiResponse saveData(HeadPhonesEntityModel headPhonesEntityModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		try {
			headPhonesEntity.setHeadPhoneName(headPhonesEntityModel.getHeadPhoneName());
			headPhonesEntity.setHeadPhoneModel(headPhonesEntityModel.getHeadPhoneModel());
			headPhonesEntity.setHeadPhoneColor(headPhonesEntityModel.getHeadPhoneColor());
			headPhonesEntity.setHeadPhoneQuality(headPhonesEntityModel.getHeadPhoneQuality());
			headPhonesEntity.setHeadPhonePrice(headPhonesEntityModel.getHeadPhonePrice());
			headPhonesRepository.save(headPhonesEntity);
			apiResponse.setMessage(GlobalConstant.dataInsertSuccess);
		} catch (Exception e) {
			// TODO: handle exception
			apiResponse.setMessage(GlobalConstant.dataInsertFail);
		}
		return apiResponse;
	}

// Get All Data Block	

	@Override
	public ApiResponse getAllData() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		List<HeadPhonesEntity> allList = headPhonesRepository.findAll();
		if (allList.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.getAllDataFail);
		} else {
			apiResponse.setListHeadPhone(allList);
			apiResponse.setMessage(GlobalConstant.getAllDataSuccess);
		}

		return apiResponse;
	}

//	Data Get By Id block

	@Override
	public ApiResponse getDataById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<HeadPhonesEntity> dbData = headPhonesRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.getByIdFail);
		} else {
			apiResponse.setHeadPhone(dbData.get());
			apiResponse.setMessage(GlobalConstant.getByIdSuccess);
		}

		return apiResponse;
	}
	
//	Data Update by PUT

	@Override
	public ApiResponse updateDataByPut(HeadPhonesEntityModel headPhonesEntityModel, Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<HeadPhonesEntity> dbData = headPhonesRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataUpdateFail);
		}else {
//			HeadPhonesEntity getData = 
			headPhonesEntity = dbData.get();
			headPhonesEntity.setHeadPhoneName(headPhonesEntityModel.getHeadPhoneName());
			headPhonesEntity.setHeadPhoneModel(headPhonesEntityModel.getHeadPhoneModel());
			headPhonesEntity.setHeadPhoneColor(headPhonesEntityModel.getHeadPhoneColor());
			headPhonesEntity.setHeadPhoneQuality(headPhonesEntityModel.getHeadPhoneQuality());
			headPhonesEntity.setHeadPhonePrice(headPhonesEntityModel.getHeadPhonePrice());
			headPhonesRepository.save(headPhonesEntity);
			apiResponse.setMessage(GlobalConstant.dataUpdateSuccess);
		}
		
		return apiResponse;
	}

//	Data Update by PATCH
	
	@Override
	public ApiResponse updateDataByPatch(HeadPhonesEntityModel headPhonesEntityModel, Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<HeadPhonesEntity> dbData = headPhonesRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataUpdateFail);
		}else {
//			HeadPhonesEntity getData = 
			headPhonesEntity = dbData.get();
			headPhonesEntity.setHeadPhoneName(headPhonesEntityModel.getHeadPhoneName());
			headPhonesEntity.setHeadPhoneModel(headPhonesEntityModel.getHeadPhoneModel());
			headPhonesEntity.setHeadPhoneColor(headPhonesEntityModel.getHeadPhoneColor());
			headPhonesEntity.setHeadPhoneQuality(headPhonesEntityModel.getHeadPhoneQuality());
			headPhonesEntity.setHeadPhonePrice(headPhonesEntityModel.getHeadPhonePrice());
			headPhonesRepository.save(headPhonesEntity);
			apiResponse.setMessage(GlobalConstant.dataUpdateSuccess);
		}

		return apiResponse;
	}

//	Data Deletion Block
	
	@Override
	public ApiResponse dataDeleteById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<HeadPhonesEntity> dbData = headPhonesRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.deletionFailed);
		}else {
			headPhonesRepository.deleteById(id);
			apiResponse.setMessage(GlobalConstant.deletionSuccess);
		}

		return apiResponse;
	}

}
