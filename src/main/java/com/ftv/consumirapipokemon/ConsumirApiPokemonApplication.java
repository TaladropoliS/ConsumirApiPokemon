package com.ftv.consumirapipokemon;

import com.ftv.consumirapipokemon.configuration.PokemonConfiguration;
import com.ftv.consumirapipokemon.models.dto.Pokemon;
import com.ftv.consumirapipokemon.models.services.PokemonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class ConsumirApiPokemonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumirApiPokemonApplication.class, args);
    }


//    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumirApiPokemonApplication.class);
//
//        PokemonService pokemonService = context.getBean(PokemonService.class);
//
//        List<Pokemon> pokemonsList = pokemonService.getPokemons();
//        for(Pokemon pokemon : pokemonsList) {
//            System.out.println(pokemon.toString());
//        }
//    }
}
