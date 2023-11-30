package com.spring.springangular.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.spring.springangular.entity.ChatMessage;
import com.spring.springangular.enums.ChatMessageType;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class WebSocketEventListener {

	
	@Autowired
	public SimpMessageSendingOperations messageTemplate;
	
	@EventListener
	public void HandleWebSocketListener(SessionDisconnectEvent event) {
		StompHeaderAccessor headerAcessor = StompHeaderAccessor.wrap(event.getMessage());
		String username = (String) headerAcessor.getSessionAttributes().get("username");
		if (username != null ) {
			log.info("User disconnected: {}",username);
			var chatMessage = ChatMessage.builder()
					.type(ChatMessageType.LEAVE)
					.sender(username)
					.build();
			messageTemplate.convertAndSend("/topic/public",chatMessage);
		}
	}
}
