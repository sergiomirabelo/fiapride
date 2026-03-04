package br.com.fiapride.main;

import br.com.fiapride.model.ArCondicionado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ArCondicionado meuArCondicionado = new ArCondicionado("Split", 2.5, 27);
        ArCondicionado profAr = new ArCondicionado("Teto", 3.0, 30);

        meuArCondicionado.aumentarTemp(2);
        meuArCondicionado.diminuirTemp(5);

        profAr.aumentarTemp(10);
        profAr.diminuirTemp(20);

    }
}

