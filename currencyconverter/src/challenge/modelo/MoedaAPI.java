package challenge.modelo;

import java.util.List;
import java.util.Map;

public record MoedaAPI (String base_code, Map<String, Double> conversion_rates) {

}
