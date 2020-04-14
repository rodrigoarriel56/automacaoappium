# language:pt
# encoding UTF-8


Funcionalidade: Realizar cadastro Midway

	Contexto: Validar a criacao de cadastro no banco 
	
	@cadastromidway
	 Cenario: Realizar cadastro no app Midway
  
    Dado que tenha app instalado no device 
    Quando acionar botao entrar na tela de versao do app
    Quando acionar botao entrar novamente
    E preencher campo cpf
    Entao devera ser solicitado o preenchimento do campo CPF