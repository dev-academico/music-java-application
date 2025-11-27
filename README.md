# Playlist Music

Projeto em Java que demonstra o uso de uma árvore AVL para gerenciar entidades de playlist (usuários, artistas e músicas).

## Estrutura de pacotes

- [`Main`](src/Main.java): ponto de entrada; instancia músicas e popula [`AVLTree.AvlTree`](src/AVLTree/AvlTree.java).
- [`AVLTree.AvlTree`](src/AVLTree/AvlTree.java): implementação genérica da árvore AVL com inserção, busca (`search`) e remoção (`delete`) balanceadas por rotações simples e duplas.
- [`AVLTree.Node`](src/AVLTree/Node.java): nó básico que armazena chave, valor, altura e ponteiros esquerdo/direito.
- [`Interfaces.InterfaceAvlTree`](src/Interfaces/InterfaceAvlTree.java): contrato exigindo `getKey()` para fornecer a chave usada na árvore.
- Modelos:
  - [`model.Music`](src/model/Music.java): representa uma música com duração (formatada por `FormatTime`) e chave incremental.
  - [`model.Artist`](src/model/Artist.java): artista com metadados de gênero e país.
  - [`model.User`](src/model/User.java): usuário com nome e e-mail.

## Fluxo principal

1. `Main` cria instâncias de [`model.Music`](src/model/Music.java) usando um contador estático como chave.
2. Os objetos são inseridos na árvore via `AvlTree.insert`, que chama `getKey()` e garante balanceamento.
3. A busca (`AvlTree.search`) retorna nós contendo os objetos; `searchCount` expõe o número de comparações realizadas.

## Execução

```bash
javac src/**/*.java
java -cp src Main
```

A saída exibirá o número de comparações feitas na última busca e o `toString` da música encontrada.