package com.spring.jsf.sample.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author m.nikolaev Date: 20.11.12 Time: 22:42
 */
@Configuration
@ImportResource({"classpath*:*applicationContext.xml"})
public class WebConfiguration {
}