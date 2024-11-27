package com.ftv.consumirapipokemon.controllers;

import com.ftv.consumirapipokemon.models.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{page}")
    public String getPokemons(@PathVariable int page, Model model) {

        //pokemonService.getPokemons(pagina).forEach(pokemon -> System.out.println(pokemon.toString()));
        model.addAttribute("pokemons", pokemonService.getPokemons(page));
        return "index";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }


}
