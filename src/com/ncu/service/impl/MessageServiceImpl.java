package com.ncu.service.impl;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.ncu.service.IMessageService;
import com.ncu.utils.MessageUtils;
@Service
public class MessageServiceImpl implements IMessageService {
/*
 * 发送短信实现类
 * */
	//注入message.properties配置中的相关信息
	@Value("${yuntongxun.host}")
	private String host;
	@Value("${yuntongxun.port}")
	private String port;
	@Value("${yuntongxun.accountSid}")
	private String accountSid;
	@Value("${yuntongxun.authToken}")
	private String authToken;
	@Value("${yuntongxun.appId}")
	private String appId;
	@Value("${yuntongxun.model}")
	private String model;
	public HashMap<String, Object> send(String phone, String[] messgaeDetail) {
		return MessageUtils.send(host, port, accountSid, authToken, appId, phone, model, messgaeDetail);
	}
}
