package org.springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static final String CONTEXT_NAME = "applicationContext.xml";

    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext(CONTEXT_NAME);
    }

}
