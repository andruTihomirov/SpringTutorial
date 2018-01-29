package org.springtutorial.config.customconfig;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springtutorial.model.Quoter;

public class PropertyFileApplicationContext extends GenericApplicationContext {

    public PropertyFileApplicationContext(String fileName) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int beanCount = reader.loadBeanDefinitions(fileName);
        System.out.println("Found " + beanCount + " beans");
        refresh();
    }

}
