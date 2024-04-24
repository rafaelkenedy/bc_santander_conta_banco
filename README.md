# Sistema de Contas Bancárias - Java

Este projeto é uma simulação simples de um sistema de contas bancárias implementado em Java. Ele permite criar uma conta com um número de agência e número de conta, atribuir um nome de cliente e um saldo inicial. O saldo é apresentado no formato de moeda brasileira.

## Funcionalidades

- Criação de uma nova conta bancária.
- Atribuição de um número único para a conta utilizando um valor incremental e UUID.
- Configuração de informações da conta, como agência, cliente e saldo.
- Exibição do saldo no formato de moeda do Brasil (Real).

## Tecnologias Utilizadas

- Java
- Scanner para entrada de dados

## Como Executar

Certifique-se de que você tem o Java JDK instalado em sua máquina.

1. Clone o repositório para sua máquina local usando `git clone` seguido do link do repositório.
2. Navegue até o diretório do projeto clonado.
3. Compile o código-fonte usando o comando `javac org/example/*.java` para gerar os arquivos `.class`.
4. Execute a aplicação com o comando `java org.example.Main`.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de diretórios:

```
src/
└── org/
    └── example/
        ├── Main.java
        └── ContaTerminal.java
```

## Licença

Este projeto é distribuído sob a licença MIT. Veja `LICENSE` para mais informações.