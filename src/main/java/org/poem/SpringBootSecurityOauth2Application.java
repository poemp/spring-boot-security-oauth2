package org.poem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Pattern;

@SpringBootApplication
public class SpringBootSecurityOauth2Application {


    public static final   Pattern BCRYPT_PATTERN = Pattern
            .compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}");


    private static final Logger logger = LoggerFactory.getLogger(SpringBootSecurityOauth2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityOauth2Application.class, args);
        String encodePassword = new BCryptPasswordEncoder( ).encode("secret");
        logger.info("\n\t client_secret= " + encodePassword);
        logger.info("is spring security 5 encode password:" + BCRYPT_PATTERN.matcher(encodePassword).find());
    }
}
