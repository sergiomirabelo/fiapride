package br.com.fiapride.model;

public class ArCondicionado {

    private String tipo;
    private double altura;
    private int tempmax;

    // 🔥 ASSOCIAÇÃO
    private ControleRemoto controle;

    // 🔥 CONSTRUTOR
    public ArCondicionado(String tipo, double altura, int tempmax, ControleRemoto controle) {
        setTipo(tipo);
        setAltura(altura);
        setTempmax(tempmax);
        this.controle = controle;
    }

    // GETTERS
    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public int getTempmax() {
        return tempmax;
    }

    public ControleRemoto getControle() {
        return controle;
    }

    // SETTERS COM VALIDAÇÃO
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public void setTempmax(int tempmax) {
        if (tempmax >= 16 && tempmax <= 30) {
            this.tempmax = tempmax;
        } else {
            System.out.println("Temperatura inválida! (16 a 30)");
        }
    }

    // MÉTODOS
    public void aumentarTemp(int valor) {
        if (valor > 0 && tempmax + valor <= 30) {
            tempmax += valor;
            System.out.println("Temperatura aumentada para: " + tempmax);
        } else {
            System.out.println("Erro ao aumentar temperatura!");
        }
    }

    public void diminuirTemp(int valor) {
        if (valor > 0 && tempmax - valor >= 16) {
            tempmax -= valor;
            System.out.println("Temperatura diminuída para: " + tempmax);
        } else {
            System.out.println("Erro ao diminuir temperatura!");
        }
    }
}