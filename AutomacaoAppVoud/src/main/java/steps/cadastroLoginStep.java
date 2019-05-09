/*
 * Projeto: Automação do App Voud 
 * Empresa: Autopass
 * Autor: Rodrigo Arriel
 * Data: 18/03/2019
 * Funcionalidade: Automação de Login do App
 * 
 */

package steps;

import cucumber.api.java.gl.E;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.HomeFuncionalidade;


public class cadastroLoginStep {
	
	@SuppressWarnings("unused")
	@Dado("^que esteja com o app do voud aberto$")
    public void que_esteja_com_o_app_do_voud_aberto() throws Throwable 
	{
		HomeFuncionalidade home = new HomeFuncionalidade();
		Thread.sleep(3000);
	}

    @Quando("^aciono o botao de cadastro ou login$")
    public void aciono_o_botao_de_cadastro_ou_login() throws Throwable
    {
    	HomeFuncionalidade home = new HomeFuncionalidade();
    	home.validarAcionamentoDeBotao();
    }
    
    @E("^preencho o campo de cpf$")
    public void preencho_o_campo_de_cpf() throws Throwable
    {
    	HomeFuncionalidade home = new HomeFuncionalidade();    	
    	home.preencimentoCpf();
    }
    
    @E("^aciono o botao de prosseguir$")
    public void aciono_o_botao_de_prosseguir() throws Throwable
    {
    	HomeFuncionalidade home = new HomeFuncionalidade();
    	home.acionamentoBotaoProsseguir();
    }    

    @E("^preencho o campo senha$")
    public void preencho_o_campo_senha() throws Throwable
    {
    	
    }
    
    @E("E aciono o botao de prosseguir$")
    public void aciono_o_botao_de_entrar()
    {
    	
    }

    @Entao("^usuario devera ser direcionado para home do app$")
    public void usuario_devera_ser_direcionado_para_home_do_app() throws Throwable 
    {
    	
    }
}