package com.ftv.consumirapipokemon.models.services;

import com.ftv.consumirapipokemon.models.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    @Autowired
    private RestTemplate restTemplate;
    private final String apiUrlBase = "https://pokeapi.co/api/v2/pokemon/";

    public List<Pokemon> getPokemons(Integer pagina) {
        List<Pokemon> ListPokemons = new ArrayList<>();
        int inicio = (pagina * 10) - 9;
        int fin = (pagina * 10);
        for (int i = inicio; i <= fin; i++) {
            String urlApi = apiUrlBase + i;
            ResponseEntity<Pokemon> response = restTemplate.exchange(urlApi, HttpMethod.GET, null, Pokemon.class);
            ListPokemons.add(response.getBody());
        }
        return ListPokemons;
    }
}

//
//@Service
//public class PokemonService {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private final String apiUrlBase = "https://pokeapi.co/api/v2/pokemon/";
//
//    public List<Pokemon> getPokemons() {
//
//        List<Pokemon> ListPokemons = new ArrayList<>();
//
//        for(int i = 1; i <= 10; i++) {
//            String urlApi = apiUrlBase + i;
//            ResponseEntity<Pokemon> response = restTemplate.exchange(
//                    urlApi,
//                    HttpMethod.GET,
//                    null,
//                    Pokemon.class
//            );
//            ListPokemons.add(response.getBody());
//        }
//
//        return ListPokemons;
//    }
//}
