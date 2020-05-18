package com.example.util

import com.example.model.UserDetails
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class UserDetailsJsonConverter : AttributeConverter<UserDetails?, String?> {
    override fun convertToDatabaseColumn(attribute: UserDetails?): String? {
        return try {
            objectMapper.writeValueAsString(attribute)
        } catch (e: JsonProcessingException) {
            null
        }
    }

    override fun convertToEntityAttribute(dbData: String?): UserDetails? {
        return try {
            objectMapper.readValue(dbData, UserDetails::class.java)
        } catch (e: IOException) {
            null
        }
    }

    companion object {
        private val objectMapper = ObjectMapper()
    }
}