package br.com.fiapride.main;
import br.com.fiapride.model.ArCondicionado;
import br.com.fiapride.model.ControleRemoto;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // 🔥 CRIANDO OS CONTROLES
        ControleRemoto controle1 = new ControleRemoto("LG", true);
        ControleRemoto controle2 = new ControleRemoto("Samsung", false);

        // 🔥 PASSANDO O CONTROLE PARA O AR (ASSOCIAÇÃO)
        ArCondicionado meuArCondicionado = new ArCondicionado("Split", 2.5, 27, controle1);
        ArCondicionado profAr = new ArCondicionado("Teto", 3.0, 30, controle2);

        System.out.println("=== DADOS INICIAIS ===");
        System.out.println("Tipo do meu ar: " + meuArCondicionado.getTipo());
        System.out.println("Temperatura atual: " + meuArCondicionado.getTempmax());

        // ✅ TESTE DA ASSOCIAÇÃO
        System.out.println("Marca do controle: " + meuArCondicionado.getControle().getMarca());
        System.out.println("Controle está ligado? " + meuArCondicionado.getControle().isLigado());

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