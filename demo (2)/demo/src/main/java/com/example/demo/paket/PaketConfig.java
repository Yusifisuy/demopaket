package com.example.demo.paket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PaketConfig {
    @Bean
    CommandLineRunner commandLineRunner(PaketRepository repository){
        return args -> {
          Paket yusif =
                  new Paket(12,"yusif");

            Paket yusiff =
                    new Paket(13,"yusiff");
        repository.saveAll(
                List.of(yusif,yusiff)
        );
        };
    }
}
