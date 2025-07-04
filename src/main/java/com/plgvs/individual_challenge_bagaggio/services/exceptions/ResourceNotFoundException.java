package com.plgvs.individual_challenge_bagaggio.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Produto não encontrado. Id " + id);
    }
}
