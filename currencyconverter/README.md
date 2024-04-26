# Criação do repositório de projetos no GitHub

1. <https://github.com/ubiratantavares/alura_challenge1>

# Configuração do ambiente de desenvolvimento Java 

1. Java JDK: versão 17: <https://www.oracle.com/br/java/technologies/downloads/>
2. Download da biblioteca Gson 2.10.1: <https://central.sonatype.com/artifact/com.google.code.gson/gson?smo=true>
3. Instalação do Postman: <https://www.postman.com/downloads/>
4. IDE: IntelliJ IDEA: <https://www.jetbrains.com/pt-br/idea/download/?section=windows>

# Compreensão da API de taxas de câmbio

1. ExchangeRate-API - Free & Pro Currency Converter API: <https://www.exchangerate-api.com/>
2. Exemplo de uso: <https://v6.exchangerate-api.com/v6/247eda6115d994c36e9c659e/latest/USD>

# Importação da biblioteca Gson na IDE

1. Abra o seu projeto no IntelliJ.
2. Clique com o botão direito na pasta do projeto no painel esquerdo.
3. Selecione "Abrir Configurações do Módulo" no menu de contexto.
3. Na janela que se abre, vá para a aba "Dependências".
4. Clique no sinal de "+" no canto inferior esquerdo e escolha "Biblioteca".
5. Procure por "gson" na caixa de pesquisa.
6. Selecione a versão do Gson que deseja utilizar.
7. Clique em "OK" para fechar a janela.

# Construção do Cliente para solicitações (HttpClient) 

1. Objeto HttpClient criado no método public MoedaAPI pesquisaCodigoMoeda(String codigo) da classe ConexaoAPI.


# Construção da Requisição (HttpRequest)

1. Objeto HttpRequest criado no método public MoedaAPI pesquisaCodigoMoeda(String codigo) da classe ConexaoAPI.

# Construção da Resposta (HttpResponse)

1. Objeto HttpResponse criado no método public MoedaAPI pesquisaCodigoMoeda(String codigo) da classe ConexaoAPI.

# Analisando a resposta em formato JSON

1. Uso do Postman para análise do endereço: <https://v6.exchangerate-api.com/v6/247eda6115d994c36e9c659e/latest/USD>

# Filtrando as moedas

Estes foram os códigos filtrados das moedas disponíveis em:
Link: <https://www.exchangerate-api.com/docs/supported-currencies>

ARS - Peso argentino
BRL - Real brasileiro
COP - Peso colombiano
USD - Dólar americano

# Convertendo os valores

A lógica de conversão foi realizada com sucesso através da classe Operacao

# Interagindo com o usuário

A interação com usuário foi realizada com sucesso através da exibição do menu da classe Operacao.

# Outras Implementações (Extras)

1. Histórico de Conversões (IMPLEMENTAR!)

Adicione a capacidade de rastrear e exibir o histórico das últimas conversões realizadas, 
oferecendo aos usuários uma visão completa de suas atividades.

2. Suporte para Mais Moedas (IMPLEMENTAR!)

Expanda a lista de moedas disponíveis para escolha, permitindo que os usuários
convertam entre uma variedade ainda maior de opções monetárias.

3. Registros de Logs (IMPLEMENTAR!)

Utilize as funções da biblioteca java.time para criar registros que registrem as conversões
realizadas, incluindo informações sobre quais moedas foram convertidas e em que momento.

# Conhecendo outras APIs de taxas de conversão (Extras)

1. Open Exchange Rates - Open Exchange Rates: <https://openexchangerates.org/>
2. CoinGecko API - Most Comprehensive Cryptocurrency API | CoinGecko: <https://www.coingecko.com/en/api>

NOTAS: A CONHECER!