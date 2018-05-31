package com.jacky.impl;

import javax.jws.WebService;

import com.jacky.GetInfoService;
import com.jacky.entity.Info;
/*
 * targetNamespace 的值是服务实现类的接口包的倒序，例如我的接口全路径为com.jacky.GetInfoService，则
 * 名称空间为http://jacky.com/，否则，客户端动态调用会找不到方法
 * */
@WebService(endpointInterface = "com.jacky.GetInfoService",targetNamespace="http://jacky.com/") 
public class GetInfoServiceImpl implements GetInfoService {

	@Override
	public int add(int number1, int number2) {
		return number1+number2;
	}

	@Override
	public Info getInfo(String name, int age) {
		Info info = new Info();
		info.setName(name);
		info.setAge(age);
		return info;
	}

}
