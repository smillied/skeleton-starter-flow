/*
 * Developed by Thales Australia, 2022
 */
package org.vaadin.example;

import com.vaadin.flow.server.HandlerHelper;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 * Define Spring Security configuration
 *
 * @author smillied
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().requestMatchers(getDefaultWebSecurityIgnoreMatcher());
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth
        // enable in memory based authentication with a user named "user" and "admin"
        .inMemoryAuthentication()
        .withUser("user")
        .password("password")
        .roles("USER")
        .and()
        .withUser("admin")
        .password("password")
        .roles("USER", "ADMIN");
  }

  /**
   * Matcher for Vaadin static (public) resources.
   *
   * @return default {@link WebSecurity} ignore matcher
   */
  public static RequestMatcher getDefaultWebSecurityIgnoreMatcher() {
    return new OrRequestMatcher(
        Stream.of(HandlerHelper.getPublicResources())
            .map(AntPathRequestMatcher::new)
            .collect(Collectors.toList()));
  }
}
