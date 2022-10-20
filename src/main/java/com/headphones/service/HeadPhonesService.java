package com.headphones.service;

import com.headphones.apiresponse.ApiResponse;
import com.headphones.entitymodel.HeadPhonesEntityModel;

public interface HeadPhonesService {

	ApiResponse dummyApi();

	ApiResponse saveData(HeadPhonesEntityModel headPhonesEntityModel);

	ApiResponse getAllData();

	ApiResponse getDataById(Integer id);

	ApiResponse updateDataByPut(HeadPhonesEntityModel headPhonesEntityModel, Integer id);

	ApiResponse updateDataByPatch(HeadPhonesEntityModel headPhonesEntityModel, Integer id);

	ApiResponse dataDeleteById(Integer id);

}
