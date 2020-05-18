package com.example.model

import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.Entity

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
data class UserDetails (
    var name: String? = null,
    var email: String? = null,
    var password: String? = null,
    var valid: Boolean = true,
    var invalidReason: String? = null

) {
    fun validate(): Boolean {
        if (name == null || name!!.trim { it <= ' ' }.length <= 0) {
            valid = false
            invalidReason = "Users name is not Valid"
        }
        if (email == null || email!!.trim { it <= ' ' }.length <= 0 || email!!.indexOf("@") <= 1) {
            valid = false
            invalidReason = "Users name is not Valid"
        }
        if (password == null || password!!.trim { it <= ' ' }.length <= 0) {
            valid = false
            invalidReason = "Password is not Valid"
        }

        return valid
    }
}