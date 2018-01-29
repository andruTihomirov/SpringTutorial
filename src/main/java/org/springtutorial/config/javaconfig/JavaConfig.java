package org.springtutorial.config.javaconfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springtutorial.dao.CoolDao;
import org.springtutorial.dao.CoolDaoImpl;
import org.springtutorial.services.CoolService;
import org.springtutorial.services.CoolServiceImpl;

@Configuration
@ComponentScan("org.springtutorial")
public class JavaConfig {

    @Bean
    public CoolDao coolDao() {
        return new CoolDaoImpl();
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CoolService coolService() {
        CoolServiceImpl service = new CoolServiceImpl();
        service.setDao(coolDao());
        return service;
    }

}
