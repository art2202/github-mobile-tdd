## Descrição do projeto

Você deve criar um aplicativo que irá listar os repositórios públicos de um usuário buscado, usando a [API do GitHub](https://developer.github.com/v3/) para buscar os dados necessários.

O aplicativo deve exibir inicialmente uma busca com o campo para inserir o nome do usuário e um botão que levará para a lista (uma dica: que tal se fosse paginada?) dos repositórios do usuário encontrado, ordenados por popularidade decrescente (exemplo de chamada da API: `https://api.github.com/users/<username_buscado>/repos`).

A tela com a lista de repositório deve exibir:
* Nome
* Avatar do usuário
* Lista de repositórios
* Cada repositório da lista deve exibir Nome do repositório, Descrição truncada

Ao clicar em um repositório, o mesmo deve levar para uma tela com:

* Nome do Repositório
* Descrição completa
* Número de Stars
* Número de Forks
* Número de issues abertas e fechadas
* Data de criação do repositório

Ao tocar no ícone para abrir no github, deve abrir no browser a página do repositório em questão.

Sua aplicação deve:

- fazer mapeamento json -> Objeto
- usar um arquivo .gitignore no seu repositório

Você ganha mais pontos se:
- possuir boa cobertura de testes unitários no projeto.
- persistir os dados localmente (app funcionando offline)
- criar testes funcionais
- fazer cache de imagens
- suportar mudanças de orientação das telas sem perder estado


