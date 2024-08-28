package com.SistemaBancario.SistemaBancario.entity;

// Exceção personalizada que herda de RuntimeException
public class IdadeNaoPermitidaException extends RuntimeException {

    public static final String MSG_IDADE_INVALIDA = "A idade do cliente precisa estar entre 18 e 65 anos.";

    // Construtor que recebe a mensagem da exceção
    public IdadeNaoPermitidaException(String msg) {
        super(msg);
    }

}
