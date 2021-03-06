package com.demo.stomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.demo.stomp.ws.Client2ServerMessage;
import com.demo.stomp.ws.Server2ClientMessage;

@RestController
public class WebSocketController {

//	@MessageMapping("/hello") // @MessageMapping 和 @RequestMapping 功能类似，浏览器向服务器发起消息，映射到该地址。
//    @SendTo("/nasus/getResponse") // 如果服务器接受到了消息，就会对订阅了 @SendTo 括号中的地址的浏览器发送消息。
//    public Server2ClientMessage say(Client2ServerMessage message) throws Exception {
//        Thread.sleep(3000);
//        return new Server2ClientMessage("Hello," + message.getName() + "!");
//    }

	@MessageMapping("/hello") 
//	@SendTo("/topic/getResponse") 
	public Server2ClientMessage say(Client2ServerMessage message) throws Exception {
		Thread.sleep(3000);
		
		this.simpMessagingTemplate.convertAndSend("/topic/getResponse", new Server2ClientMessage("1.Hello," + message.getName() + "!"));
		this.simpMessagingTemplate.convertAndSend("/topic/getResponse2", new Server2ClientMessage("2.Hello," + message.getName() + "!"));
		
		return new Server2ClientMessage("Hello," + message.getName() + "!");
	}
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

}
