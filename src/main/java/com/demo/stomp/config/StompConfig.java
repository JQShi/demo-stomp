package com.demo.stomp.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurationSupport;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

@Configuration
@EnableWebSocketMessageBroker
public class StompConfig extends WebSocketMessageBrokerConfigurationSupport implements WebSocketMessageBrokerConfigurer {

	@Override
	public void configureWebSocketTransport(WebSocketTransportRegistration registry) {
		// TODO Auto-generated method stub
		super.configureWebSocketTransport(registry);
	}

	@Override
	public void configureClientInboundChannel(ChannelRegistration registration) {
		// TODO Auto-generated method stub
		super.configureClientInboundChannel(registration);
	}

	@Override
	public void configureClientOutboundChannel(ChannelRegistration registration) {
		// TODO Auto-generated method stub
		super.configureClientOutboundChannel(registration);
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		// TODO Auto-generated method stub
		super.addArgumentResolvers(argumentResolvers);
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
		// TODO Auto-generated method stub
		super.addReturnValueHandlers(returnValueHandlers);
	}

	@Override
	public boolean configureMessageConverters(List<MessageConverter> messageConverters) {
		// TODO Auto-generated method stub
		return super.configureMessageConverters(messageConverters);
	}

	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// TODO Auto-generated method stub
		super.configureMessageBroker(registry);
	}

	@Bean
	public WebSocketHandler subProtocolWebSocketHandler() {
		// TODO
		return null;
	}
	

	
	
	
}
