package com.ftv.consumirapipokemon.models.dto;

public class TypeDetails {

    private String name;

    private String url;

    public TypeDetails(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public TypeDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TypeDetails{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
