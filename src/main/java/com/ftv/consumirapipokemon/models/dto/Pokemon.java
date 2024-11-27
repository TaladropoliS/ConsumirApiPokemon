package com.ftv.consumirapipokemon.models.dto;

import java.util.List;

public class Pokemon {

    private Integer id;

    private String name;

    private Integer base_experience;

    private Sprites sprites;

    private List<Ability> abilities;

    private List<Types> types;

    public Pokemon(Integer id, String name, Sprites sprites, Integer base_experience, List<Ability> abilities, List<Types> types) {
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.abilities = abilities;
        this.types = types;
    }

    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", base_experience=" + base_experience +
                ", sprites=" + sprites.getFront_default() +
                ", abilities=" + abilities.get(0).toString() +
                ", abilities=" + abilities.get(1).toString() +
                ", types=" + types.get(0).toString() +
                '}';
    }
}
