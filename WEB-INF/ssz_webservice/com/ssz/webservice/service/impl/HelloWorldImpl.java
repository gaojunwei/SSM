package com.ssz.webservice.service.impl;

import javax.jws.WebService;

import javax.wsdl.extensions.ElementExtensible;


@WebService(endpointInterface="com.ssz.webservice.service.impl.HelloWorld",serviceName="helloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String sayHello(String username) {
		System.out.println("sayHello() is called");
		return username +" helloWorld";
	}
}