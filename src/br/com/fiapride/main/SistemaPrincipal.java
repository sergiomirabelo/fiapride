package br.com.fiapride.main;

import br.com.fiapride.model.ArCondicionado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ArCondicionado meuArCondicionado = new ArCondicionado("Split", 2.5, 27);
        ArCondicionado profAr = new ArCondicionado("Teto", 3.0, 30);

        System.out.println("Tipo do meu ar: " + meuArCondicionado.getTipo());
        System.out.println("Temperatura máxima: " + meuArCondicionado.getTempmax());

        meuArCondicionado.aumentarTemp(2);
        meuArCondicionado.diminuirTemp(3);

        profAr.aumentarTemp(10);
        profAr.diminuirTemp(20);

        System.out.println("\nTestando proteção da classe:");

        meuArCondicionado.setTempmax(40); // inválido
        meuArCondicionado.setTempmax(15); // inválido
        meuArCondicionado.setTempmax(24); // válido

        System.out.println("Temperatura final do meu ar: " + meuArCondicionado.getTempmax());

    }
}

