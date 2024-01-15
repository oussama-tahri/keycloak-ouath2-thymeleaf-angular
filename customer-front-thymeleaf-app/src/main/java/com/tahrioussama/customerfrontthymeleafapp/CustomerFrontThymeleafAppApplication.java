package com.tahrioussama.customerfrontthymeleafapp;

import com.tahrioussama.customerfrontthymeleafapp.entities.Customer;
import com.tahrioussama.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Oussama").email("oussama@gmail.com").build());
            customerRepository.save(Customer.builder().name("Marouane").email("marouane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Nawfal").email("nawfal@gmail.com").build());
        };
    }
}
