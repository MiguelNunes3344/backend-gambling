# API REST em Spring Boot para Cadastro de Usuários e Gerenciamento de Saldo

Esta é uma API REST desenvolvida em Spring Boot que fornece funcionalidades para o cadastro de usuários e o gerenciamento de seus saldos em um sistema de apostas online. A API é projetada para ser consumida pelo frontend do site de apostas, disponível em [Frontend](https://github.com/seu-usuario/frontend-apostas).

## Funcionalidades Principais

1. **Cadastro de Usuários:** A API permite o registro de novos usuários no sistema, fornecendo informações como nome de usuário, senha e saldo.
2. **Gerenciamento de Saldo:** A API permite que os usuários consultem seus saldos atuais e façam depósitos e saques em suas contas.

## Endpoints da API

A API oferece os seguintes endpoints principais:

- `GET /`: Obtém os usuários.
- `GET /number`: Obtém o saldo do primeiro usuário registrado.
- `Post /`: Cria um novo usuário.
- `POST /update`: Realiza um depósito na conta de um usuário.
- `POST /withdraw`: Permite que um usuário faça um saque de sua conta.

## Tecnologias Utilizadas

- **Spring Boot:** Framework Java para desenvolvimento de aplicativos web e APIs REST.
- **Java:** Linguagem de programação utilizada para desenvolver a API.
- **H2 DataBases:** Você pode configurar um banco de dados SQL para armazenar informações de usuários e saldos.

## Como Executar

1. Clone este repositório.
2. Configure seu banco de dados e atualize as configurações de banco de dados no arquivo `application.properties`.
3. Execute a aplicação Spring Boot.
4. A API estará acessível em `http://localhost:8080`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) e enviar pull requests para melhorias ou correções.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

