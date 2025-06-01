# Projeto Banco

Este é um projeto simples de simulação de operações bancárias em Java. O objetivo é demonstrar conceitos básicos de orientação a objetos, como encapsulamento, construtores, métodos e uso de classes auxiliares para logging.

## Funcionalidades

- Criação de contas bancárias com nome, agência e número da conta.
- Depósito de valores na conta.
- Saque de valores, com verificação de saldo.
- Registro de operações no console via classe de log.
- Exibição do saldo e informações da conta.
- Exibição do saldo total do banco ao final da execução.

## Estrutura dos Arquivos

- `Account.java`: Classe que representa uma conta bancária e suas operações.
- `Bank.java`: Classe responsável por gerenciar as contas e calcular o saldo total do banco.
- `Log.java`: Classe responsável por registrar mensagens de log no console.
- `app.java`: Classe principal para executar e testar as funcionalidades do projeto.

## Como Executar

1. Compile todos os arquivos Java:
   ```sh
   javac *.java
   ```

2. Execute a aplicação:
   ```sh
   java App
   ```

## Exemplo de Uso

Ao executar o projeto, você poderá criar contas, realizar depósitos e saques, e ao final visualizar todas as contas criadas, seus saldos e o saldo total do banco. Todas as operações são registradas no console.

---

Projeto desenvolvido para fins de estudo e prática de programação orientada a objetos em Java.