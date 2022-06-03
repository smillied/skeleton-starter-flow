/*
 * Developed by Thales Australia, 2022
 */
package org.vaadin.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A Spring {@link Configuration} class to be used for configuring the beans needed by the WebApp
 *
 * @author smillied
 */
@Configuration
public class SpringWebAppConfiguration {

  /**
   * Provide a {@link GreetService} instance as a bean
   *
   * @return the {@link GreetService} instance
   */
  @Bean
  public GreetService greetService() {
    GreetService service = new GreetService();
    return service;
  }
}
