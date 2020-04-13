/*
 * Projeto: Automacao App
 * Empresa: 
 * Autor: Rodrigo Arriel
 * Data: 
 * Funcionalidade: Automacao do App
 * 
 */

package cenariosTestCaes;

//import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.HomeFuncionalidade;


public class cadastroMidwayStep {
	

	@Dado("^que esteja com o app aberto$")
	public void que_esteja_com_o_app_aberto() throws Throwable 
	{
		HomeFuncionalidade home = new HomeFuncionalidade();
		home.btnEntrar();
	 
	}
	
	@Quando("^acionar botao entrar na tela de versao do app$")
	public void acionar_botao_entrar_na_tela_de_versao_do_app() throws Throwable 
	{
		HomeFuncionalidade home = new HomeFuncionalidade();
		home.btnEntrar();
	 
	}
	
	@Quando("^acionar botao entrar novamente$")
	public void acionar_botao_entrar_novamente() throws Throwable {
	 
	}
	
	@Quando("^preencher campo cpf$")
	public void preencher_campo_cpf() throws Throwable 
	{
		HomeFuncionalidade home = new HomeFuncionalidade();    	
    	home.campoCpf();
	 
	}
	
	@Entao("^devera ser solicitado o preenchimento do campo CPF$")
	public void devera_ser_solicitado_o_preenchimento_do_campo_CPF() throws Throwable 
	{
		
	}

}