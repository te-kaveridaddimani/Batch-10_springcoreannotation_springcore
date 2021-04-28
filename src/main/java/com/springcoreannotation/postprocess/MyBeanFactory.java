package com.springcoreannotation.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeforeFactoryPostProcessor");
		BeanDefinition beanDefinition=beanFactory.getBeanDefinition("msgBean");
		MutablePropertyValues values=beanDefinition.getPropertyValues();
		values.addPropertyValue("msg", "welcome to TechnoElevate");
		
	}
	

}
