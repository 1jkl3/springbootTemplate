package com.gzsdkt.pdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PdemoApplication {
    public SpringApplicationBuilder  configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(PdemoApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(PdemoApplication.class, args);
    }
}
