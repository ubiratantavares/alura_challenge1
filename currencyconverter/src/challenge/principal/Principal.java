package challenge.principal;

import challenge.modelo.Moeda;
import challenge.modelo.MoedaAPI;
import challenge.util.ConexaoAPI;
import challenge.util.MoedaConvertida;
import challenge.util.Operacao;

import java.io.IOException;
import java.util.List;

public class Principal {

    public static void executar(Operacao operacao, int indiceOrigem, int indiceDestino)
            throws IOException, InterruptedException {
        List<Moeda> moedas = operacao.filtraMoedas();
        MoedaAPI moedaAPI = new ConexaoAPI().pesquisaMoeda(moedas.get(indiceOrigem).getCodigo());
        Moeda moedaOrigem = new MoedaConvertida().converta(moedaAPI);
        double valor = operacao.lerValor();
        operacao.exibeMensagem(moedaOrigem, moedas.get(indiceDestino), valor);
    }
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        operacao.apresentaMenu();
        int opcao = operacao.lerOpcao();
        while (opcao != 7) {
            switch (opcao) {
                case 1: {
                    try {
                        executar(operacao,3, 0);
                        break;
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 2: {
                    try {
                        executar(operacao, 0, 3);
                        break;
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 3: {
                    try {
                        executar(operacao, 3, 1);
                        break;
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 4: {
                    try {
                        executar(operacao, 1, 3);
                        break;
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 5: {
                    try {
                        executar(operacao, 3, 2);
                        break;
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 6: {
                    try {
                        executar(operacao, 2, 3);
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
            }
            operacao.apresentaMenu();
            opcao = operacao.lerOpcao();
        }
    }
}
