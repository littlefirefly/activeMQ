package com.yuexin.test;

import com.yuexin.jms.MsgProducer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 15-4-21
 * Time: 下午10:05
 * To change this template use File | Settings | File Templates.
 */
public class TestMQ {

    @Test
    public void testSend() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        MsgProducer producer = (MsgProducer) context.getBean("msgProducer");
        producer.send();
    }
}
