package br.com.fiapride.main;

import br.com.fiapride.model.ArCondicionado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ArCondicionado meuArCondicionado = new ArCondicionado("Split", 2.5, 27);
        ArCondicionado profAr = new ArCondicionado("Teto", 3.0, 30);

        System.out.println("=== DADOS INICIAIS ===");
        System.out.println("Tipo do meu ar: " + meuArCondicionado.getTipo());
        System.out.println("Temperatura atual: " + meuArCondicionado.getTempmax());

        System.out.println("\n=== TESTE DE FUNCIONAMENTO ===");
        meuArCondicionado.aumentarTemp(2);
        meuArCondicionado.diminuirTemp(3);

        profAr.aumentarTemp(10);
        profAr.diminuirTemp(20);

        System.out.println("\n=== TESTE DE PROTEÇÃO (ENCAPSULAMENTO) ===");

        System.out.println("Tentando definir temperatura para 40 (inválido):");
        meuArCondicionado.setTempmax(40);

        System.out.println("Tentando definir temperatura para 15 (inválido):");
        meuArCondicionado.setTempmax(15);

        System.out.println("Definindo temperatura para 24 (válido):");
        meuArCondicionado.setTempmax(24);

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Temperatura final do meu ar: " + meuArCondicionado.getTempmax());
    }
}

