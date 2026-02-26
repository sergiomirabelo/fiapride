package br.com.fiapride.main;
import br.com.fiapride.model.ArCondicionado;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ArCondicionado meuArCondicionado = new ArCondicionado();
        meuArCondicionado.tipo = "Split";
        meuArCondicionado.tempmax = 27;

        ArCondicionado profAr = new ArCondicionado();
        profAr.tipo = "Teto";
        profAr.tempmax = 30;

        System.out.println("A temperatura máxima do meu ar é: " + meuArCondicionado.tempmax);
        System.out.println("A temperatura máxima do ar do professor é: " + profAr.tempmax);


    }
}

