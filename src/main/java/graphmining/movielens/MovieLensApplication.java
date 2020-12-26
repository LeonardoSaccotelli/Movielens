package graphmining.movielens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieLensApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieLensApplication.class, args);
    }

    /*@Bean
    CommandLineRunner run(){
        Logica di estrazione e caricamento dati
    }*/
}
