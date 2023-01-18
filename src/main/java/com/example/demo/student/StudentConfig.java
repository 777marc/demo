package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
      return args -> {
          Student marc  = new Student(
              "marc mendoza",
              "777marc@gmail.com",
              LocalDate.of(1969, Month.SEPTEMBER, 12),
              52
          );
          Student narc  = new Student(
                  "narc mendoza",
                  "777narc@gmail.com",
                  LocalDate.of(1969, Month.SEPTEMBER, 12),
                  52
          );

          repository.saveAll(List.of(marc, narc));

      };
    };
}
