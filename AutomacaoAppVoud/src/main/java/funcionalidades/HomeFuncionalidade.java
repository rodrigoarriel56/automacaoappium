/*
 * Projeto: Automacao
 * Empresa: 
 * Autor:
 * Data: 
 * Funcionalidade: Classe de mapeamento de elementos.
 * 
 */

package funcionalidades;

import screens.HomeStep;
import static junit.framework.TestCase.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeFuncionalidade {

    public HomeStep home;
	private WebDriver driver;

    public HomeFuncionalidade()
    {
    	home = new HomeStep();
    }
    
    public void validarAcionamentoDeBotao() throws InterruptedException
    {
    	home.getCadastroLogin().click();
    	WebDriver driver = null;
    	@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 1); //Metodo de espera para outra acao
		
    }
    
    public void preencimentoCpf()
    {
        home.getpreenchimentoCpf().sendKeys("12345678909");
    }
    
    public void acionamentoBotaoProsseguir() throws InterruptedException 
    {
    	home.getBotaoProcesseguir().click();
    	@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 1);
    	
    }
        
    public void preencherCampoSenha() throws InterruptedException 
    {
    	home.getpreencherCampoSenha().sendKeys("123456");
    	Thread.sleep(2000); 	
    	
    }
    
    public void validarHome()
    {
    	home.getVisor().isEnabled();
    }
      
    public void validaResultado(int result)
    {
    	String resultados = String.valueOf(result); //Pega texto da tela logada
        String pegarTextoNaTela = home.getVisor().getText();
        assertTrue(resultados.contains(pegarTextoNaTela));
    } 

}