/*
 * Developed by Thales Australia, 2022
 */
package org.vaadin.example;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Registers the Spring Security filter into the filter chain
 *
 * @author smillied
 */
@Order(2)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {}
