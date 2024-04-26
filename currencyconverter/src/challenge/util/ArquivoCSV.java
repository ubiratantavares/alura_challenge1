package challenge.util;

import challenge.modelo.Moeda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoCSV {

    // método para ler dados de um arquivo CSV
    public static List<Moeda> ler(String nomeArquivo) throws IOException {
        List<Moeda> moedas = new ArrayList<>();
        BufferedReader leia = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        while ((linha = leia.readLine()) != null) {
            String[] cols = linha.split(",");
            if (cols[0] != null && cols[1] != null && cols[2] != null) {
                Moeda moeda = new Moeda(cols[0], cols[1], cols[2]);
                moedas.add(moeda);
            }
        }
        leia.close();
        return moedas;
    }
}
