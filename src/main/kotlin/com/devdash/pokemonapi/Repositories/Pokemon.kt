package com.devdash.pokemonapi.Repositories

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Entity(name = "pokemon")
data class Pokemon(
    @jakarta.persistence.Id @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var name: String,
    var photo: String
) {
    constructor(name: String, photo: String) : this(0L , name , photo)
}

@Repository
interface PokemonRepository : JpaRepository<Pokemon, Long>