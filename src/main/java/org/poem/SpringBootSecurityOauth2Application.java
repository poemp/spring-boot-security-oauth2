package org.poem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.util.regex.Pattern;

/** @author poem */
@SpringBootApplication
@EnableOAuth2Client
public class SpringBootSecurityOauth2Application {

  private static final Logger logger =
      LoggerFactory.getLogger(SpringBootSecurityOauth2Application.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringBootSecurityOauth2Application.class, args);
    logger.info("SpringBootSecurityOauth2Application");
    String encodePassword = new BCryptPasswordEncoder().encode("secret");
    logger.info("encodePassword start " + encodePassword);
  }
}
