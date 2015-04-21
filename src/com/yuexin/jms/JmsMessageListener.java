/** -----------------------------------------------------------------------------------------------------
 Copyright(C) 	2012-2015 北京可为时代   	
 All rights reserved

 项目名			: 
 文件名			: JmsMessageListener.java
 文件建立者		: 叶正康
 当前文件类型		: 
 文件基本功能  	: 
 文件建立日期	 	: Apr 3, 2013

 修改历史:
 日期 			修改人 			版本 			描述
 --------------	--------------	--------------	--------------
 Apr 3, 2013	叶正康      		1.0				1.0 Version
 --------------------------------------------------------------------------------------------------------- */
package com.yuexin.jms;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.*;
import java.util.concurrent.atomic.AtomicInteger;

@Component("jmsMessageListener")
public class JmsMessageListener implements MessageListener {

    private static final Logger logger = Logger.getLogger(JmsMessageListener.class);

    @Autowired
    private AtomicInteger counter;

    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                TextMessage tm = (TextMessage) message;
                String msg = tm.getText();
                logger.info("消息客户端正在接受队列消息,接受到的消息是:" + msg);
                counter.incrementAndGet();
            } else if (message instanceof ObjectMessage) {
                ObjectMessage om = (ObjectMessage) message;
                String msg = om.toString();
                logger.info("消息客户端正在接受队列消息,接受到的消息是:" + msg);
                counter.incrementAndGet();
            }
        } catch (JMSException e) {
            logger.error(e.getMessage(), e);
        }
    }
}
