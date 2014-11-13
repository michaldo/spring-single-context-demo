package q;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoApplicationConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class<?>[] {WebAppConfig.class, SecurityConfig.class};

   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return null;
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] {"/"};
   }

   @Configuration
   @EnableWebMvc
   @ComponentScan("q")
   public static class WebAppConfig extends WebMvcConfigurerAdapter {

   }

   @Configuration
   @EnableWebSecurity
   public static class SecurityConfig extends WebSecurityConfigurerAdapter {

      @Autowired
      public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication().withUser("bob").password("bobspassword").roles("USER");
      }
   }

   public static class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

   }

}
