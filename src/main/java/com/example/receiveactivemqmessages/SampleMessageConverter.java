package com.example.receiveactivemqmessages;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class SampleMessageConverter implements MessageConverter {
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        Message1 message1 = (Message1) object;
        MapMessage message = session.createMapMessage();
        message.setString("title", message1.getTitle());
        message.setString("msgBody", message1.getMsgBody());
        return message;
    }

    public Object fromMessage(Message message) throws JMSException, MessageConversionException {
        MapMessage mapMessage = (MapMessage) message;
        return new Message1(mapMessage.getString("title"), mapMessage.getString("msgBody"));
    }
}
