package com.ftv.consumirapipokemon.models.dto;

public class Types {

    private TypeDetails type;

    public Types(TypeDetails type) {
        this.type = type;
    }

    public Types() {
    }

    public TypeDetails getType() {
        return type;
    }

    public void setType(TypeDetails type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "type=" + type +
                '}';
    }
}
