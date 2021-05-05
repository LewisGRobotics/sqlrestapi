package com.example.demo.thought;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThoughtConfig {

    @Bean
    CommandLineRunner commandLineRunner(ThoughtRepository repository){
        return args ->{
            Thought t1 = new Thought(
				"Hello there!",
				LocalDate.of(2020,Month.DECEMBER, 5),
                5,
                5,
                5
			);
            Thought t2 = new Thought(
				"This is a thought database",
				LocalDate.of(2021,Month.APRIL, 15),
                5,
                5,
                5
			);
            
            repository.saveAll(
                List.of(t1, t2)
            );
        };

    }
    
}