package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws") //User connect server ไหน
                .setAllowedOriginPatterns("*") //Allow ให้ทุกคนเข้ามาหมด
                .withSockJS(); //Subscript
    }
    @Override //กำหนด path ที่จะรับหรือส่งข้อมูล
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app") //ระดับของ application broadcast
                //.setUserDestinationPrefix() ส่งคนต่อคน
                .enableSimpleBroker("/topic"); //server broadcast ออก
    }


}
