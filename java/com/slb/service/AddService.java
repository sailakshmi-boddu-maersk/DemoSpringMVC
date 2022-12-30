package com.slb.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class AddService {
    public int add(int i,int j) {
    	return i+j;
    }
}
