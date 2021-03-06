package org.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtutorial.config.customconfig.PropertyFileApplicationContext;
import org.springtutorial.config.javaconfig.JavaConfig;
import org.springtutorial.model.Quoter;
import org.springtutorial.services.CoolService;

public class Main {

    public static final String CONTEXT_NAME = "applicationContext.xml";

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext(CONTEXT_NAME);
        xmlContext.getBean(Quoter.class).sayQuote();

        AnnotationConfigApplicationContext javaContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        javaContext.getBean(CoolService.class).process();

        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();

    }

}
