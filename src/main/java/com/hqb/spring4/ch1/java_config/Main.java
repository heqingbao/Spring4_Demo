package com.hqb.spring4.ch1.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heqingbao on 2017/6/2.
 */
public class Main {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService service = context.getBean(UseFunctionService.class);
        System.out.println(service.sayHello("java config"));

        context.close();
    }
}
