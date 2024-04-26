package challenge.modelo;

import java.util.HashMap;
import java.util.Map;

public class Moeda {

    private static int contador = 0;

    private int id;
    private String codigo;

    private String nome;

    private String pais;

    private Map<String, Double> conversoes = new HashMap<>();

    public Moeda(String codigo, String nome, String pais) {
        this.id = contador++;
        this.codigo = codigo;
        this.nome = nome;
        this.pais = pais;
    }

    public Moeda(MoedaAPI moedaAPI) {
        this.codigo = moedaAPI.base_code();
        this.conversoes = moedaAPI.conversion_rates();
    }

    public int getId() {
        return id;
    }

    public Map<String, Double> getConversoes() {
        return conversoes;
    }

    public double buscaTaxa(Moeda moedaDestino) {
        double valor = 1.0;
        for (String chave : conversoes.keySet()) {
            if (chave.equalsIgnoreCase(moedaDestino.getCodigo())) {
                valor = conversoes.get(chave);
                break;
            }
        }
        return valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return this.getId() + ", " + this.getCodigo() + ", " + this.getNome() + ", " + this.getPais();
    }
}
