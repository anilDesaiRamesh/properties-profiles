/**
 * 
 */
package com.anil.property.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.anil.property.bean.JmsPropertyBean;
import com.anil.property.bean.PropertyBean;

/**
 * @author Anil_Ramesh
 *
 */
@Configuration

public class PropertyConfig {

	@Value("${anil.username}")
	private String user;
	@Value("${anil.password}")
	private String password;
	@Value("${anil.url}")
	private String url;
	@Value("${jms.user}")
	private String jmsuser;
	@Value("${jms.password}")
	private String jmspassword;
	@Value("${jms.url}")
	private String jmsurl;

	@Bean
	public PropertyBean getProperty() {
		PropertyBean bean = new PropertyBean();
		bean.setUser(user);
		bean.setPassword(password);
		bean.setUrl(url);
		return bean;
	}

	@Bean
	public JmsPropertyBean getJmsProperty() {
		JmsPropertyBean jmsBean = new JmsPropertyBean();
		jmsBean.setJmsuser(jmsuser);
		jmsBean.setJmspassword(jmspassword);
		jmsBean.setJmsurl(jmsurl);
		return jmsBean;
	}

}
