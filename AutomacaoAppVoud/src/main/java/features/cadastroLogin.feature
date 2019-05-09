# language:pt
# encoding UTF-8

Funcionalidade: Realizar cadastro no app VouD

  @cadastroLogin
  Cenario: Realizar cadastro no app VouD
    Dado que esteja com o app do voud aberto
    Quando aciono o botao de cadastro ou login
    E preencho o campo de cpf com um cpf que nao esteja na base <CPF>
    E aciono o botao de prosseguir
    E preencho o campo senha <SENHA>
    E aciono o botao de entrar
    Entao usuario devera ser direcionado para home do app