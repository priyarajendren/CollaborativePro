package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ChatMessageDao;

@Service
public class ChatMessageService {
	
	@Autowired
	ChatMessageDao chatdao;
	
	public void inserMessage(String sender,String msg)
	{
		System.out.println(chatdao);
		chatdao.insertMessage(sender, msg);
	}

}
