package com.ssz.service.impl;

import org.springframework.stereotype.Service;

import com.ssz.service.BService;
@Service("bService")
public class BServiceImpl implements BService{
	
	public void barB(String _msg, int _type) {  
        System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");  
        System.out.println(1/0);
    }  
    public void fooB() {  
        System.out.println("BServiceImpl.fooB()");  
    }
}
