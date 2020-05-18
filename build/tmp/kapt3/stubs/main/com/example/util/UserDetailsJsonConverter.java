package com.example.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/util/UserDetailsJsonConverter;", "Ljavax/persistence/AttributeConverter;", "Lcom/example/model/UserDetails;", "", "()V", "convertToDatabaseColumn", "attribute", "convertToEntityAttribute", "dbData", "Companion", "demo"})
@javax.persistence.Converter(autoApply = true)
public final class UserDetailsJsonConverter implements javax.persistence.AttributeConverter<com.example.model.UserDetails, java.lang.String> {
    private static final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    public static final com.example.util.UserDetailsJsonConverter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String convertToDatabaseColumn(@org.jetbrains.annotations.Nullable()
    com.example.model.UserDetails attribute) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.model.UserDetails convertToEntityAttribute(@org.jetbrains.annotations.Nullable()
    java.lang.String dbData) {
        return null;
    }
    
    public UserDetailsJsonConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/util/UserDetailsJsonConverter$Companion;", "", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "demo"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}