package com.ftv.consumirapipokemon.controllers;

import com.ftv.consumirapipokemon.models.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/")
    public String getPokemons(Model model) {
        model.addAttribute("pokemons", pokemonService.getPokemons(1));
        return "index";
    }

    @GetMapping("/{page}")
    public String getPokemonsPage(@PathVariable int page, Model model) {
        if (page < 1 || page > 102) {
            return "redirect:/1";
        }
        model.addAttribute("titulo", "API Pokemon's");
        model.addAttribute("pokemonsPage", pokemonService.getPokemons(page));
        return "indexPage";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
