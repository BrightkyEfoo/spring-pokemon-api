package com.devdash.pokemonapi.Services

import com.devdash.pokemonapi.Repositories.Pokemon
import com.devdash.pokemonapi.Repositories.PokemonRepository
import com.devdash.pokemonapi.dto.PokemonDTORequest
import com.devdash.pokemonapi.dto.PokemonDTOResponse
import org.springframework.stereotype.Service

@Service
class PokemonService(var pokemonRepository: PokemonRepository) {
    fun createPokemon(pokemonToCreate: PokemonDTORequest): PokemonDTOResponse {
        val repoSave = pokemonRepository.save(
            Pokemon(name = pokemonToCreate.name, photo = pokemonToCreate.photo)
        )

        return PokemonDTOResponse(repoSave.name, repoSave.photo, repoSave.id)
    }


    fun getpokemons(): List<PokemonDTOResponse> {
        val repoRes = pokemonRepository.findAll()
        return repoRes.map {
            PokemonDTOResponse(name = it.name, photo = it.photo, id = it.id)
        }
    }
}