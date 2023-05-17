# Projeto de Backend Java Spring com API Rest

Este repositório contém um projeto de backend em Java utilizando o framework Spring, que implementa uma API REST seguindo boas práticas de desenvolvimento. A arquitetura adotada é baseada em DTO, Service Layer, ResponseDTO e Presentation Layer, proporcionando uma separação clara de responsabilidades e uma estrutura de código organizada e de fácil manutenção.

# Tecnologias Utilizadas

- Java
- Spring Framework
- Spring Boot
- API Rest
- DTO (Data Transfer Object)

# Funcionalidades Principais

- Cadastro de jogos: Os usuários podem cadastrar jogos na lista, fornecendo informações como título, gênero, descrição, entre outras informações relevantes.

- Separar por gêneros: Os jogos são organizados em gêneros, permitindo que os usuários visualizem os jogos agrupados de acordo com suas preferências. Dessa forma, é possível separar jogos de ação, aventura, estratégia, entre outros gêneros.

- Alterar a posição dos jogos: Os usuários têm a capacidade de modificar a posição dos jogos na lista. Isso permite que eles personalizem a ordem de exibição dos jogos de acordo com suas preferências individuais.

O projeto de backend é desenvolvido para criar uma lista de jogos, permitindo a separação por gêneros e fornecendo a funcionalidade de alteração de posição dos jogos de acordo com a preferência do usuário.

# Arquitetura
A arquitetura do projeto é baseada no seguinte fluxo de dados:

- DTO (Data Transfer Object): São classes que representam os objetos de dados transferidos entre as camadas do sistema. Eles são utilizados para encapsular os dados que serão transferidos pela API, facilitando a manipulação e garantindo uma separação clara entre a camada de apresentação e a camada de serviço.

- Service Layer: A camada de serviço é responsável pela lógica de negócio do sistema. Nesta camada, são implementadas as regras de negócio e a manipulação dos dados recebidos pelos DTOs. Aqui ocorre a interação com o banco de dados e outras operações necessárias para processar as requisições da API.

- ResponseDTO: Após a manipulação dos dados pela camada de serviço, os dados são encapsulados em objetos de resposta (ResponseDTO) que serão retornados pela API. Esses objetos são criados de acordo com as necessidades de cada endpoint e podem conter apenas os dados relevantes para a resposta.

- Presentation Layer: A camada de apresentação é responsável por receber as requisições HTTP e encaminhá-las para a camada de serviço adequada. Nesta camada, são implementados os controllers que definem os endpoints da API e fazem a conversão entre DTOs e objetos de domínio.

# Configuração e Uso
Siga as instruções abaixo para configurar e executar o projeto em seu ambiente local:

- Clone este repositório em sua máquina:
`git clone https://github.com/seu-usuario/nome-do-repositorio.git` 

- Abra o projeto em sua IDE preferida.

- Compile o arquivo DSListAplication.java

- Abra no seu navegador no local host na prota 8080
