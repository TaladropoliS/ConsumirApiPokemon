package com.ftv.consumirapipokemon.models.services;

import com.ftv.consumirapipokemon.models.dao.PokemonDAO;
import com.ftv.consumirapipokemon.models.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PokemonService {

    @Autowired
    private PokemonDAO pokemonDAO;

    public List<Pokemon> getPokemons(Integer page) {
        return pokemonDAO.getPokemons(page);
    }


}
