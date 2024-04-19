package com.spring.demo.event;

import com.spring.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ObjectPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage(User user) {
        System.out.println("ObjectPublisher Người gửi sự kiến đã chạy");

        applicationEventPublisher.publishEvent(new SendInfoEvent(this, user));
    }
}
