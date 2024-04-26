package challenge.util;

import challenge.modelo.Moeda;
import challenge.modelo.MoedaAPI;
import challenge.util.ArquivoCSV;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Operacao {

    private String criaLinha(char c, int tamanho) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            s.append(c);
        }
        return s.toString();
    }

    private void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int lerOpcao() {
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        while (opcao < 1 || opcao > 7) {
            imprimeMensagem("Opção inválida. Escolha uma opção válida: ");
            opcao = leitura.nextInt();
        }
        return opcao;
    }

    public double lerValor() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter: ");
        double valor = leitura.nextDouble();
        while (valor < 0) {
            imprimeMensagem("Valor inválido. Digite um valor válido (valor positivo): ");
            valor = leitura.nextDouble();
        }
        return valor;
    }

    public void exibeMensagem(Moeda moedaOrigem, Moeda moedaDestino, double valor) {
        String mensagem = String.format("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]",
                valor,
                moedaOrigem.getCodigo(),
                moedaOrigem.buscaTaxa(moedaDestino) * valor,
                moedaDestino.getCodigo());
        imprimeMensagem(mensagem);
    }

    public void apresentaMenu() {
        imprimeMensagem(criaLinha('*', 50));
        imprimeMensagem("Seja bem-vindo/a ao Conversor de Moeda =]\n");
        imprimeMensagem("(1) Dólar =>>> Peso argentino");
        imprimeMensagem("(2) Peso argentino =>>> Dólar");
        imprimeMensagem("(3) Dólar =>>> Real brasileiro");
        imprimeMensagem("(4) Real brasileiro =>>> Dólar");
        imprimeMensagem("(5) Dólar =>>> Peso Colombiano");
        imprimeMensagem("(6) Peso Colombiano =>>> Dólar");
        imprimeMensagem("(7) Sair");
        imprimeMensagem("Escolha uma opção válida: ");
        imprimeMensagem(criaLinha('*', 50));
        imprimeMensagem("\n");
    }

    private List<Moeda> getMoedas() throws IOException {
        return ArquivoCSV.ler("supported.csv");
    }

    public List<Moeda> filtraMoedas() throws IOException {
        List<String> nomes = Arrays.asList("United States Dollar", "Argentine Peso", "Brazilian Real", "Colombian Peso");
        List<Moeda> moedas = new ArrayList<>();
        for (Moeda moeda : getMoedas()) {
            if (moeda.getNome().equals(nomes.get(0)) || moeda.getNome().equals(nomes.get(1)) ||
                moeda.getNome().equals(nomes.get(2)) || moeda.getNome().equals(nomes.get(3))) {
                moedas.add(moeda);
            }
        }
        return moedas;
    }
}
