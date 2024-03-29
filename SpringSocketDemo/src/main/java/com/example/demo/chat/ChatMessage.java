package com.example.demo.chat;

import com.example.demo.config.WebSocketEventListener;
import lombok.Builder;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;

@Getter
@Builder
public class ChatMessage { //Chat Format
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    public static int ConnectedCount = 0;
    private int Active_Count = 0;

    public static int increaseCount(){
        ConnectedCount = ConnectedCount + 1;
        return ConnectedCount;
    }
    public static int decreaseCount(){
        ConnectedCount = ConnectedCount - 1;
        return ConnectedCount;
    }

    public int setValue(int Active_Count){
        this.Active_Count = Active_Count;
        return Active_Count;
    }
}
