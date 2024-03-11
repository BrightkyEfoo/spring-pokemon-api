package com.devdash.pokemonapi.Controllers

import com.devdash.pokemonapi.Services.PokemonService
import com.devdash.pokemonapi.dto.PokemonDTORequest
import com.devdash.pokemonapi.dto.PokemonDTOResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("pokemons")
class Pokemons(var pokemonService: PokemonService) {
    @GetMapping("")
    fun getPokeemons(): Map<String, Any> {
        return mapOf("msg" to "here is all available pokemons", "data" to pokemonService.getpokemons())
    }

    @PostMapping("")
    fun createPokemon(@RequestBody newPokemon : PokemonDTORequest): PokemonDTOResponse {
        return pokemonService.createPokemon(newPokemon)
    }
}