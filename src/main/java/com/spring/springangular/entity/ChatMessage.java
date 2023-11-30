package com.spring.springangular.entity;

import com.spring.springangular.enums.ChatMessageType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ChatMessage {

	private String content;
	private String sender;
	private ChatMessageType type;
	
	
}
