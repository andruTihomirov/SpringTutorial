package org.springtutorial.screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.Color;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "org.springtutorial.screensaver.")
public class Config {

    @Bean
    // ProxyMode wrong case, because every time when we mention color, we instance new object
    // @Scope(value = "prototype" /*, proxyMode = ScopedProxyMode.TARGET_CLASS*/)
    @Scope(value = "periodical") // custom scope
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            public Color getColor() {
                return color(); // Good case! Prototype inside singleton
            }
        };
    }

}
