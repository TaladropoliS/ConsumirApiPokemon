package com.ftv.consumirapipokemon.controllers;

import com.ftv.consumirapipokemon.models.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/")
    public String getPokemons(Model model) {
        pokemonService.getPokemons().forEach(pokemon -> System.out.println(pokemon.toString()));
        model.addAttribute("pokemons", pokemonService.getPokemons());
        return "index";
    }

//    @GetMapping("/")
//    public String getPokemons(Model model, @RequestParam(defaultValue = "1") Integer pagina) {
//        pokemonService.getPokemons(pagina).forEach(pokemon -> System.out.println(pokemon.toString()));
//        model.addAttribute("pokemons", pokemonService.getPokemons(pagina));
//        return "index";
//    }
}
