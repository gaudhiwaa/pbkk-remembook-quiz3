package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args ->{
//            Student mommy = new Student(
//                    "mommy",
//                    LocalDate.of(2000, Month.APRIL, 5),
//                    "yoshd@gmail.com"
//            );
//
//            Student daddy = new Student(
//                    "daddy",
//                    LocalDate.of(2007, Month.APRIL, 5),
//                    "sussty@gmail.com"
//            );
//
//            repository.saveAll(
//                    List.of(mommy, daddy)
//            );
//        };
//    }
}
