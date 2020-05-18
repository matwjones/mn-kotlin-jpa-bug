package com.example.model

import com.example.util.UserDetailsJsonConverter
import com.fasterxml.jackson.annotation.JsonInclude
import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Introspected
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "registrationrequest")
data class RegistrationRequest(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var key: String? = null,

    @Convert(converter = UserDetailsJsonConverter::class)
    var userDetails: UserDetails? = null
)