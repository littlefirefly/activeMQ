package com.yuexin.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.*;

@Component("msgProducer")
public class MsgProducer {

    @Resource
    private JmsTemplate jmsTemplate;

    //消息存放在队列中
    @Resource(name = "queue.destination")
    private Destination destination;

    public void send() {
        try {
            jmsTemplate.send(destination, new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    ObjectMessage message = session.createObjectMessage("object");
                    return message;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
