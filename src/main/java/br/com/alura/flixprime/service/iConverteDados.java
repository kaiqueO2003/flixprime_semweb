package br.com.alura.flixprime.service;

public interface iConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
