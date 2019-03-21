package steps;

import hooks.Hooks;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.HomeFuncionalidade;


public class SomaSteps {
	
	@Dado("^que esteja com o app do voud aberto$")
    public void que_esteja_com_o_app_do_voud_aberto() throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        home.validarPreencimentoCpf();
        //home.validarHome();
	}

   /* @Dado("^que esteja na tela inicial da calculadora$")
    public void que_esteja_na_tela_inicial_da_calculadora() throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        home.validarPreencimentoCpf();
        //home.validarHome();
    }*/

    @Quando("^somo (\\d+) com (\\d+)$")
    public void somo_com(int num1, int num2) throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        //home.somarNumeros(num1, num2);
    }

    @Entao("^visualizo o (\\d+) como resultado$")
    public void visualizo_o_como_resultado(int resultado) throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        //home.validaResultado(resultado);
        Hooks.depoisdoCenario();
    }
}
