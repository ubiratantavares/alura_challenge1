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

1. Uso do Postman para análise do endereço: <>
9. Filtrando as moedas

Na oitava fase do nosso desafio, concentramo-nos no processo de filtrar as moedas utilizando a biblioteca Gson em Java.

Para acessar dados específicos, como os valores das diferentes moedas, é essencial entender como navegar pela 
estrutura JSON da resposta da API.

Estrutura JSON:

Para o filtro de moedas, será necessário usar o atributo "Currency Code" do JSON. 
Para o desafio, você poderá escolher pelo MENOS SEIS "Currency Code" para incluir na sua aplicação. 

Estes códigos são:

ARS - Peso argentino
BOB - Boliviano boliviano
BRL - Real brasileiro
CLP - Peso chileno
COP - Peso colombiano
USD - Dólar americano

Link: <https://www.exchangerate-api.com/docs/supported-currencies>

10. Convertendo os valores

Na nona fase, finalmente realizaremos as conversões entre as moedas, agora que já temos os valores das taxas 
de câmbio em mãos.

Dessa forma, o próximo passo é implementar a lógica de conversão utilizando as taxas obtidas para calcular 
os valores convertidos entre as moedas desejadas.

DICA: Uma sugestão é criar métodos ou funções específicas para realizar esses cálculos, o que tornará o 
código mais modular e fácil de entender.

Experimente utilizar variáveis para armazenar os valores inseridos pelo usuário, aplicar as taxas de conversão 
e exibir os resultados finais.

Esta fase representa a culminação do desafio, onde todas as peças se encaixam para oferecer uma experiência 
completa de conversão de moedas.


11. Interagindo com o usuário

Nesta etapa do desafio, vamos nos envolver na interação com o usuário, implementando uma interface textual por 
meio do console que apresenta opções de conversão de moedas. A estrutura incluirá um menu dentro de um loop 
de repetição, permitindo que o usuário selecione opções numéricas e forneça dados para a conversão, utilizando 
a classe Scanner para capturar a entrada do usuário.

No final, o programa exibirá o valor convertido conforme a escolha do usuário. Além disso, é fundamental 
realizar testes abrangentes para garantir o correto funcionamento do programa, simulando várias situações e 
fluxos para identificar e corrigir possíveis erros.

Abaixo um exemplo de como poderá estrururar seu menu para interagir com o usuário em seu conversor de moedas.

12. Extras (Opcional)

Caso deseje se desafiar ainda mais e proporcionar aos usuários uma experiência mais rica e personalizada, 
existem várias funcionalidades interessantes que você pode explorar:

Histórico de Conversões: Adicione a capacidade de rastrear e exibir o histórico das últimas conversões realizadas, 
oferecendo aos usuários uma visão completa de suas atividades.

Suporte para Mais Moedas: Expanda a lista de moedas disponíveis para escolha, permitindo que os usuários 
convertam entre uma variedade ainda maior de opções monetárias.

Registros de Logs: Utilize as funções da biblioteca java.time para criar registros que registrem as conversões 
realizadas, incluindo informações sobre quais moedas foram convertidas e em que momento.

Desafie-se a implementar essas características e torne seu projeto uma ferramenta ainda mais poderosa e versátil!

13. Extras - Conhecendo outras APIs de taxas de conversão

Há outras opções no mercado de APIs de taxa de câmbio que oferecem versões gratuitas, semelhantes ao ExchangeRate. 

Abaixo, apresentamos algumas alternativas adicionais para expandir seu conhecimento:

Open Exchange Rates - Open Exchange Rates
<https://openexchangerates.org/>

CoinGecko API - Most Comprehensive Cryptocurrency API | CoinGecko
<https://www.coingecko.com/en/api>

Cada uma dessas APIs tem sua própria documentação e características, oferecendo uma variedade de opções para enriquecer
sua experiência no desenvolvimento do Conversor de Moedas. Explore essas opções e escolha aquela que melhor se 
adapte aos seus objetivos e requisitos específicos.


