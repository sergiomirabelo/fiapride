package br.com.fiapride.model;

public class ControleRemoto {

    private String marca;
    private boolean ligado;

    public ControleRemoto(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isLigado() {
        return ligado;
    }
}