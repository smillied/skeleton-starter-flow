/*
 * Developed by Thales Australia, 2022
 */
package org.vaadin.example;

import com.vaadin.flow.spring.VaadinMVCWebAppInitializer;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

/** The {@link WebApplicationInitializer} used to initialise Vaadin with Spring MVC */
@Order(1)
public class SpringWebAppInitializer extends VaadinMVCWebAppInitializer {

  /** {@inheritDoc} */
  @Override
  protected Collection<Class<?>> getConfigurationClasses() {

    return Arrays.asList(SpringWebAppConfiguration.class, SecurityConfiguration.class);
  }
}
