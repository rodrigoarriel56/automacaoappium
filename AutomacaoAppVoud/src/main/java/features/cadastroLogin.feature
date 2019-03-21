# language:pt
# encoding UTF-8

Funcionalidade: Realizar soma

  @cadastroLogin
  Cenario: Realizar login no app do voud
    Dado que esteja com o app do voud aberto
    Quando aciono o botao de cadastro ou login
    Entao e apresentado o campo de preenchimento do cfp do usuario
