/** -----------------------------------------------------------------------------------------------------
 Copyright(C) 	2012-2015 北京可为时代   	
 All rights reserved

 项目名			: 
 文件名			: DefauleMessageDelegate.java
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

import java.io.Serializable;
import java.util.Map;

public class DefauleMessageDelegate implements MessageDelagate {

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void handleMessage(Map message) {
        System.out.println(message);
    }

    @Override
    public void handleMessage(byte[] message) {
        System.out.println(message);
    }

    @Override
    public void handleMessage(Serializable message) {
        System.out.println(message);
    }

}
