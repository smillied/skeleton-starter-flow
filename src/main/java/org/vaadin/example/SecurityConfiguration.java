/*
 * Developed by Thales Australia, 2022
 */
package org.vaadin.example;

import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Define Spring Security configuration
 *
 * @author smillied
 */
@EnableWebSecurity
@Configuration
@ComponentScan(basePackages = {"com.vaadin.flow.spring.security"})
public class SecurityConfiguration extends VaadinWebSecurityConfigurerAdapter {}
