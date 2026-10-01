package br.fiap.calculadorathymeleaf.service;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculadoraService {
    public double calcular(int a, int b, String operacao) {
        return switch (operacao){
            case "somar" -> a + b;
            case "subtrair" -> a - b;
            case "multiplicar" -> a * b;
            case "dividir" -> dividir(a,b);
            default -> throw new IllegalArgumentException("Operação inválida");
        };
    }

    private double dividir(int a, int b) {

        if (b == 0){
            throw new IllegalArgumentException("Não existe divisão por zero");
        }

        return (double) a/b;
    }
}
