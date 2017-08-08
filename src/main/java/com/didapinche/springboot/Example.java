package com.didapinche.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Example {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return new ExitCodeGenerator() {
            @Override
            public int getExitCode() {
                System.out.println("====================");
                return 42;
            }
        };
    }

}

@Component
@Order(2)
class Runner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Runner.run()");
    }
}

@Component
@Order(1)
class Runner2 implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Runner2.run()");
    }
}
