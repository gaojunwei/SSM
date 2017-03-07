package com.ssz.service.impl;

import org.springframework.stereotype.Service;

import com.ssz.service.AService;

@Service("aService")
public class AServiceImpl implements AService{
	public void barA() {  
        System.out.println("AServiceImpl.barA()");  
    }  
    public void fooA(String _msg) {  
        System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");  
    }
}
