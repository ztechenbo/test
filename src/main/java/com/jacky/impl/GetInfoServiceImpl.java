package com.jacky.impl;

import javax.jws.WebService;

import com.jacky.GetInfoService;
import com.jacky.entity.Info;
/*
 * targetNamespace ��ֵ�Ƿ���ʵ����Ľӿڰ��ĵ��������ҵĽӿ�ȫ·��Ϊcom.jacky.GetInfoService����
 * ���ƿռ�Ϊhttp://jacky.com/�����򣬿ͻ��˶�̬���û��Ҳ�������
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
