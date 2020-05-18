package com.example.init;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/init/DataLoader;", "Lio/micronaut/context/event/ApplicationEventListener;", "Lio/micronaut/runtime/server/event/ServerStartupEvent;", "()V", "requestRepository", "Lcom/example/repository/RequestRepository;", "getRequestRepository", "()Lcom/example/repository/RequestRepository;", "setRequestRepository", "(Lcom/example/repository/RequestRepository;)V", "onApplicationEvent", "", "event", "demo"})
@javax.inject.Singleton()
public final class DataLoader implements io.micronaut.context.event.ApplicationEventListener<io.micronaut.runtime.server.event.ServerStartupEvent> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.repository.RequestRepository requestRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.repository.RequestRepository getRequestRepository() {
        return null;
    }
    
    public final void setRequestRepository(@org.jetbrains.annotations.NotNull()
    com.example.repository.RequestRepository p0) {
    }
    
    @java.lang.Override()
    public void onApplicationEvent(@org.jetbrains.annotations.Nullable()
    io.micronaut.runtime.server.event.ServerStartupEvent event) {
    }
    
    public DataLoader() {
        super();
    }
}