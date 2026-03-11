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


    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public int getTempmax() {
        return tempmax;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTempmax(int tempmax) {
        if (tempmax >= 16 && tempmax <= 30) {
            this.tempmax = tempmax;
        } else {
            System.out.println("Temperatura inválida! Deve estar entre 16 e 30 graus.");
        }
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