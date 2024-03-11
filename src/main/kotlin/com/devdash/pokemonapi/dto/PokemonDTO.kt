package com.devdash.pokemonapi.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDTORequest(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("photo")
    var photo: String
)

data class PokemonDTOResponse(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("photo")
    var photo: String,
    @JsonProperty("id")
    var id: Long? = null,
)