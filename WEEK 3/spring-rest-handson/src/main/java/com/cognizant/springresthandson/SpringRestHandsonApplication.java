package com.cognizant.springresthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springresthandson.model.Country;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        LOGGER.info("Inside main");

        displayCountry();
    }

    private static void displayCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        LOGGER.debug("Country : {}", country);
    }
}