package challenge.util;

import challenge.modelo.Moeda;
import challenge.modelo.MoedaAPI;

public class MoedaConvertida {
    public Moeda converta(MoedaAPI moedaAPI)  {
        return new Moeda(moedaAPI);
    }
}

