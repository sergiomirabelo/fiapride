package br.com.fiapride.model;

public class ArCondicionado {

    private String tipo;
    private double altura;
    private int tempmax;

    public ArCondicionado(String tipo, double altura, int tempmax) {
        this.tipo = tipo;
        this.altura = altura;
        this.tempmax = tempmax;
    }

    public void aumentarTemp(int valor) {
        if (valor > 0 && tempmax + valor <= 30) {
            tempmax += valor;
            System.out.println("Temperatura aumentada para: " + tempmax);
        } else {
            System.out.println("Valor inválido! Não pode ultrapassar 30°C.");
        }
    }

    public void diminuirTemp(int valor) {
        if (valor > 0 && tempmax - valor >= 16) {
            tempmax -= valor;
            System.out.println("Temperatura diminuída para: " + tempmax);
        } else {
            System.out.println("Valor inválido! Não pode ser menor que 16°C.");
        }
    }
}