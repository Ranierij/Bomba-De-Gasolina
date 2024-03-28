package br.senac.bombadegasolina;

public class BombaDeGasolina {
    public static void main(String[] args) {
        // Definindo os preços dos combustíveis
        double precoGasolina = 5.0; // Preço por litro de gasolina
        double precoDiesel = 4.0;   // Preço por litro de diesel
        double precoAlcool = 4.5;   // Preço por litro de álcool
        
        // Definindo os tipos de bomba de combustível
        String bombaGasolina = "Bomba de Gasolina";
        String bombaDiesel = "Bomba de Diesel";
        String bombaEtanol = "Bomba de Etanol";
        
        // Escolhendo a bomba de combustível e quantidade de litros
        int opcaoBomba = 1;  // Suponha que o usuário escolheu a bomba de gasolina
        double litrosAbastecidos = 40.0;  // Suponha que o usuário deseja abastecer 40 litros
        
        // Verificando a escolha do usuário e definindo o preço e o tipo de combustível correspondentes
        double precoSelecionado = 0.0;
        String tipoCombustivel = "";
        switch (opcaoBomba) {
            case 1:
                precoSelecionado = precoGasolina;
                tipoCombustivel = "Gasolina";
                break;
            case 2:
                precoSelecionado = precoDiesel;
                tipoCombustivel = "Diesel";
                break;
            case 3:
                precoSelecionado = precoAlcool;
                tipoCombustivel = "Álcool";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        
        // Calculando o custo total do abastecimento
        double custoTotal = litrosAbastecidos * precoSelecionado;
        
        // Exibindo o recibo do abastecimento
        System.out.println("Recibo:");
        System.out.println("Tipo de Bomba: " + (opcaoBomba == 1 ? bombaGasolina : (opcaoBomba == 2 ? bombaDiesel : bombaEtanol)));
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Litros abastecidos: " + litrosAbastecidos);
        System.out.println("Preço por litro: R$" + precoSelecionado);
        System.out.println("Total a pagar: R$" + custoTotal);
    }
}
