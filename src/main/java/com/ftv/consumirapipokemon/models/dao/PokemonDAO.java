package com.ftv.consumirapipokemon.models.dao;

import com.ftv.consumirapipokemon.models.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PokemonDAO {

    @Autowired
    private RestTemplate restTemplate;

    private final String apiUrlBase = "https://pokeapi.co/api/v2/pokemon/";

    public List<Pokemon> getPokemons(Integer page) {

        List<Pokemon> ListPokemons = new ArrayList<>();
        int inicio = page * 10 - 9;
        int fin = page * 10;
        for (int i = inicio; i <= fin; i++) {
            String urlApi = apiUrlBase + i;
            ResponseEntity<Pokemon> response = restTemplate.exchange(
                    urlApi,
                    HttpMethod.GET,
                    null,
                    Pokemon.class
            );
            ListPokemons.add(response.getBody());
        }

        return ListPokemons;
    }
}
