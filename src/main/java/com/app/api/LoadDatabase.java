package com.app.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(BookRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Book("The C++ Programming Language", "Bjarne Stroustrup",
          "0-201-12078-X", "Reference", "The Definitive reference and guide to C++", 1986, 299)));
    };
  }
}