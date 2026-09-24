package Model.service;

import java.util.List;

public class Cadastrosecretarias {
    package com.Cadastrosecretarias.service;


import com.Cadastrosecretarias.model.Pokemon;
import com.Cadastrosecretarias.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class PokemonService {

        private final CadastrosecretariasRepository CadastrosecretariasRepository;

        public PokemonService(CadastrosecretariasRepository pokemonRepository, CadastrosecretariasRepository CadastrosecretariasRepository1) {
            this.CadastrosecretariasRepository = pokemonRepository1;
        }

        public List<Cadastrosecretarias> getLista(){

            return CadastrosecretariasRepository.getLista();
        }




        public String adicionarCadastrosecretarias(Cadastrosecretarias cadastrosecretarias){


            return CadastrosecretariasRepository.addCadastrosecretarias(cadastrosecretarias);
        }

        public Cadastrosecretarias buscarCadastrosecretarias() {

            return CadastrosecretariasRepository.buscarCadastrosecretarias();

        }

        public String updateCadastrosecretarias(String nome, Cadastrosecretarias cadastrosecretarias){
            return CadastrosecretariasRepository.updateCadastrosecretarias(nome, Cadastrosecretarias);
        }

    }
}
