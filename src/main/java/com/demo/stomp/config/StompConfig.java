package com.demo.stomp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class StompConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //注册一个 Stomp 的节点(endpoint),并指定使用 SockJS 协议。
        registry.addEndpoint("/endpointNasus").withSockJS();
    }

//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        // 广播式配置名为 /nasus 消息代理 , 这个消息代理必须和 controller 中的 @SendTo 配置的地址前缀一样或者全匹配
//        registry.enableSimpleBroker("/nasus");
//    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableStompBrokerRelay("/topic/", "/queue/");
    }
}