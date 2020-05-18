package com.example.init

import com.example.model.RegistrationRequest
import com.example.model.UserDetails
import com.example.repository.RequestRepository
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import io.reactivex.functions.Consumer
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataLoader : ApplicationEventListener<ServerStartupEvent> {

    @Inject
    lateinit var requestRepository: RequestRepository

    override fun onApplicationEvent(event: ServerStartupEvent?) {
        val r: RegistrationRequest = RegistrationRequest();
        r.key = "sometestkey"

        val u: UserDetails = UserDetails()
        u.name = "TestName"
        u.password = "somepassword"
        u.email = "some@email.com"
        r.userDetails = u

        if (requestRepository.existsByKey(r.key!!)) {
            return;
        }
        requestRepository.save(r);
    }
}