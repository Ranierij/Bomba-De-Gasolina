package br.senac.bombacombustivel;

public class BombaDeCombustivel {
    // Definição dos preços dos combustíveis
    private static final double[] PRECOS = {5.0, 4.0, 4.5}; // Gasolina, Diesel, Álcool
    
    // Definição dos tipos de bomba de combustível
    private static final String[] BOMBAS = {"Bomba de Gasolina", "Bomba de Diesel", "Bomba de Etanol"};
    
    // Definição da quantidade inicial de litros na bomba para cada tipo de combustível
    private static final int[] LITROS_INICIAIS = {200, 200, 200}; // Gasolina, Diesel, Álcool
    
    public static void main(String[] args) {
        int opcaoBomba = 1;  // Suponha que o usuário escolheu a bomba de gasolina
        double litrosAbastecidos = 40.0;  // Suponha que o usuário deseja abastecer 40 litros
        
        if (!verificarOpcaoBomba(opcaoBomba)) {
            System.out.println("Opção inválida.");
            return;
        }
        
        double precoSelecionado = obterPrecoSelecionado(opcaoBomba);
        String tipoCombustivel = obterTipoCombustivel(opcaoBomba);
        
        if (!verificarCombustivelSuficiente(opcaoBomba, litrosAbastecidos)) {
            System.out.println("Não há combustível suficiente na bomba.");
            return;
        }
        
        atualizarLitrosNaBomba(opcaoBomba, litrosAbastecidos);
        double custoTotal = calcularCustoTotal(precoSelecionado, litrosAbastecidos);
        
        exibirRecibo(opcaoBomba, tipoCombustivel, litrosAbastecidos, precoSelecionado, custoTotal);
        System.out.println("Litros restantes na bomba: " + LITROS_INICIAIS[opcaoBomba - 1]);
    }
    
    private static boolean verificarOpcaoBomba(int opcaoBomba) {
        return opcaoBomba >= 1 && opcaoBomba <= PRECOS.length;
    }
    
    private static double obterPrecoSelecionado(int opcaoBomba) {
        return PRECOS[opcaoBomba - 1];
    }
    
    private static String obterTipoCombustivel(int opcaoBomba) {
        return BOMBAS[opcaoBomba - 1];
    }
    
    private static boolean verificarCombustivelSuficiente(int opcaoBomba, double litrosAbastecidos) {
        return litrosAbastecidos <= LITROS_INICIAIS[opcaoBomba - 1];
    }
    
    private static void atualizarLitrosNaBomba(int opcaoBomba, double litrosAbastecidos) {
        LITROS_INICIAIS[opcaoBomba - 1] -= litrosAbastecidos;
    }
    
    private static double calcularCustoTotal(double precoLitro, double litros) {
        return litros * precoLitro;
    }
    
    private static void exibirRecibo(int opcaoBomba, String tipoCombustivel, double litrosAbastecidos, double precoSelecionado, double custoTotal) {
        System.out.println("Recibo:");
        System.out.println("Tipo de Bomba: " + BOMBAS[opcaoBomba - 1]);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Litros abastecidos: " + litrosAbastecidos);
        System.out.println("Preço por litro: R$" + precoSelecionado);
        System.out.println("Total a pagar: R$" + custoTotal);
    }
}
