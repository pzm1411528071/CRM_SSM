package com.ncu.service;
import java.util.HashMap;
public interface IMessageService {
	HashMap<String, Object> send(String phone,String[] messgaeDetail);
}
