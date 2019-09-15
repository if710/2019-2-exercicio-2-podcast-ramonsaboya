# IF710 2019.2 - Exercício 2 - Podcast Player

Esta tarefa envolve os conceitos de UI widgets, Threads, Custom Adapters, 
Intents, Permissions, SharedPreferences, e SQLite. 
Siga os passos na ordem sugerida abaixo e identifique quais os passos completados no seu repositório. 

A versão atual da aplicação lê um arquivo XML obtido a partir de um feed, usando `AsyncTask`
e faz o parsing para obter as informações úteis para exibição. Atualmente, toda vez que a 
aplicação é aberta, é feito o download e exibição da lista de itens. 

Este exercício consiste em implementar as funcionalidades básicas de um player de podcast,
como persistência dos dados, gerenciar o download de episódios do podcast, escutar um 
episódio, atualizações em segundo plano, notificações de novos episódios, etc. 

1.  Ajuste o parser de XML (`Parser.kt`) para obter o link de download do arquivo XML em questão. Já há um método criado `readItem`, basta obter o valor do atributo correspondente e retornar; 
2.  Faça o carregamento do arquivo XML usando uma tarefa assíncrona, seja por meio de `AsyncTask`, seja por meio de `Anko` e `doAsync`, obtendo como resultado um objeto do tipo `List<ItemFeed>`;
3.  Use um `RecyclerView` para exibir os dados obtidos a partir do carregamento do XML. Use inicialmente este objeto para popular um RecyclerView por meio de um _Custom Adapter_ que usa o layout XML disponível em `res/layout/itemlista.xml`;
4.  Faça com que a aplicação passe a usar um banco de dados SQLite, por meio de `Room`, como forma de persistir os dados. Isto é, após o download e parsing do RSS, a lista de episódios deve ser armazenada no banco;
5.  Altere a aplicação de forma que, ao clicar em um título, o usuário seja direcionado para `EpisodeDetailActivity`, onde devem ser exibidos os detalhes do episódio em questão (descrição, link, opcionalmente alguma imagem associada ao episódio);
6.  Altere a fonte de dados do `RecyclerView` para usar o banco de dados ao invés do resultado do AsyncTask. Ou seja, mesmo que esteja sem conectividade, deve ser possível ao menos listar todos os itens obtidos na última vez que o app rodou. 

---

# Orientações

  - Comente o código que você desenvolver, explicando o que cada parte faz.
  - Entregue o exercício mesmo que não tenha completado todos os itens listados acima. (marque no arquivo README.md do seu repositório o que completou, usando o template abaixo)

----

# Status

| Passo | Completou? |
| ------ | ------ |
| 1 | **não** |
| 2 | **não** |
| 3 | **não** |
| 4 | **não** |
| 5 | **não** |
| 6 | **não** |
