package com.toomuch2learn.reactive.crud.catalogue;

import com.toomuch2learn.reactive.crud.catalogue.configuration.FileStorageProperties;
import com.toomuch2learn.reactive.crud.catalogue.repository.CatalogueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class SpringReactiveCrudCatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactiveCrudCatalogueApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(CatalogueRepository repository) {
//        return args -> {
//            repository.findAll().subscribe(e-> {
//                System.out.println(e.getDescription());
//            });
//        };
//    }
}
