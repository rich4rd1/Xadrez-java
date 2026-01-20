# Xadrez em Java (Terminal)

Projeto educacional para modelagem de um jogo de xadrez em Java, com foco em **orientação a objetos**, **separação de responsabilidades** e **clareza de domínio**, utilizando representação visual no terminal.

Este repositório não tem como objetivo imediato entregar um jogo completo e fechado, mas sim **construir a base correta**, passo a passo, respeitando boas práticas de design.

---

## Objetivo do Projeto

* Praticar **POO em Java** de forma aplicada
* Modelar corretamente entidades de domínio (Tabuleiro, Casa, Peça, etc.)
* Separar **regras de movimento** de **regras de jogo**
* Evoluir gradualmente para um jogo funcional
* Utilizar o terminal como meio de visualização inicial

---

## Estrutura Atual

### Pacotes principais

```
src/
 ├── pecas/
 │   ├── Peca.java
 │   ├── Peao.java
 │   ├── Torre.java
 │   ├── Bispo.java
 │   ├── Cavalo.java
 │   ├── Rei.java
 │   └── Rainha.java
 ├── tabuleiro/
 │   ├── Tabuleiro.java
 │   └── CasaTabuleiro.java
 └── Main.java
```

---

## ♟️ Modelagem do Tabuleiro

### `Tabuleiro`

* Responsável por:

  * Criar e inicializar as 64 casas
  * Organizar as casas em uma matriz 8x8
  * Fornecer acesso às casas por linha e coluna

### `CasaTabuleiro`

Representa uma casa individual do tabuleiro.

Responsabilidades:

* Guardar posição (linha e coluna)
* Saber sua cor (clara ou escura)
* Saber se está vazia ou ocupada
* Manter referência à peça que ocupa a casa

Métodos relevantes:

* `estaVazia()`
* `ocupaCasa(Peca peca)`
* `liberaCasa()`
* `representacao()` → usado para visualização no terminal

Casas vazias são representadas por:

```
·
```

---

## ♜ Modelagem das Peças

### `Peca` (classe abstrata)

Base para todas as peças do jogo.

Responsabilidades:

* Guardar a cor da peça (`WHITE` ou `BLACK`)
* Manter referência à casa atual
* Definir contrato de movimento

Métodos principais:

* `movimentoValido(CasaTabuleiro destino)` *(abstrato)*
* `getSimbolo()` *(abstrato)*

## Importante: **a peça não conhece o tabuleiro inteiro**. Ela apenas responde se um movimento é válido **do ponto de vista da sua regra de movimento**.

---

### Implementações atuais

#### `Torre`

* Movimento válido quando:

  * permanece na mesma linha **ou**
  * permanece na mesma coluna

Representação:

* Branca: `♖`
* Preta: `♜`

#### `Peao`

* Implementação inicial (em evolução)

Representação:

* Branco: `♙`
* Preto: `♟`

---

## Visualização no Terminal

O tabuleiro é impresso no terminal utilizando símbolos Unicode.

Exemplo de saída atual:

```
. . . . . . . .
. . . . . . . .
. . . . . . . .
. . . . . . . .
. . . . . . . .
. . . . . . . .
♙ . . . . . . .
♖ . . . . . . .
```

Essa visualização é **temporária**, usada apenas para facilitar o desenvolvimento e a validação das regras.

---

## Decisões de Design Importantes

### Separação de responsabilidades

* **Peça**

  * Define *como pode se mover*
  * Não verifica caminho
  * Não executa captura

* **Tabuleiro / Jogo (futuro)**

  * Verifica se há peças no caminho
  * Decide se captura é permitida
  * Executa o movimento

Essa separação evita acoplamento excessivo e facilita a extensão do código.

---

## Próximos Passos Planejados

* Implementar as regras de movimento das demais peças:

  * Bispo
  * Cavalo
  * Rainha
  * Rei

* Criar uma classe `Jogo` ou `Partida`

  * Centralizar a lógica de movimentação
  * Validar caminho livre
  * Tratar capturas

* Inicialização automática das peças no tabuleiro

* Entrada de comandos pelo usuário

* Evolução futura para interface gráfica (opcional)

---

## Status do Projeto

Em desenvolvimento inicial

O foco atual está em **correção conceitual**, não em velocidade de entrega.

---

## Autor

Projeto desenvolvido para fins de estudo e aprofundamento em Java e orientação a objetos.
