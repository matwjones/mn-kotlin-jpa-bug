package com.example.repository

import com.example.model.RegistrationRequest
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface RequestRepository : CrudRepository<RegistrationRequest, Long> {
    fun existsByKey(key: String): Boolean
}