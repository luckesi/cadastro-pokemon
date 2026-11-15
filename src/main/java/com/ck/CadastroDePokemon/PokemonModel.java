package com.ck.CadastroDePokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ttb_cadastro_de_pokemons")
public class PokemonModel {

    //atributos
    @Id //seta pokedex como id (futura primary key)
    private int pokedex;
    private String nome;

    //construtores

    public PokemonModel (){
    }

    public PokemonModel (int pokedex, String nome){
        setPokedex(pokedex);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPokedex() {
        return pokedex;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }
}
