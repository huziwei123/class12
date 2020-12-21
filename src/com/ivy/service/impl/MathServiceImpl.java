package com.ivy.service.impl;

import javax.jws.WebService;
import com.ivy.service.MathService;
@WebService

public class MathServiceImpl implements MathService {

	@Override
	public int add(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
	}

	@Override
	public int sub(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1-number2;
	}

	@Override
	public int mul(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1*number2;
	}

	@Override
	public int dev(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1/number2;
	}
	

}
