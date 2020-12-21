package com.ivy.server.demo;

import javax.xml.ws.Endpoint;

import com.ivy.service.impl.MathServiceImpl;

public class ServerDemo {
	public static void main(String[] args) {
		//远程服务器的地址
		String address="http://127.0.0.1:6789/math";
		//业务的具体的实现类对象 那个真正干活的那个对象、
		MathServiceImpl implementor=new MathServiceImpl();
		//服务器多线程的 创建了一个子线程 监听有谁来调用服务
		Endpoint endpoint=Endpoint.publish(address, implementor);
		System.out.println("sercer has been starred....");
	}

}
