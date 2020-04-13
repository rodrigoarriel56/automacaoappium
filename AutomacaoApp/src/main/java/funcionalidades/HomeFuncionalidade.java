/*
 * Projeto: Automacao app
 * Empresa: 
 * Autor:
 * Data: 
 * Funcionalidade: Classe de mapeamento de elementos.
 * 
 */

package funcionalidades;

//import static org.junit.Assert.assertTrue;

//import static junit.framework.TestCase.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageElemets.PageElements;

public class HomeFuncionalidade {

    public PageElements home; //Estancia da classe pageElemts
   
	private WebDriver driver;

    public HomeFuncionalidade()
    {
    	home = new PageElements();
    }
    
    public void btnEntrar() throws InterruptedException
    {
    	Thread.sleep(3000);
    	home.getBtnEntrar();
    	
    	@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 1); //Metodo de espera para outra acao
    }
    
    public void campoCpf() throws InterruptedException
    {
    	home.getcampoCpf().click();
    	Thread.sleep(3000);
    	home.getcampoCpf().sendKeys("12345678909");
        Thread.sleep(2000);
    }
    
    
      
    public void validaResultado(int result)
    {
    	@SuppressWarnings("unused")
		String resultados = String.valueOf(result); //Pega texto da tela logada
        //String pegarTextoNaTela = home.getVisor().getText();
        //assertTrue(resultados.contains(pegarTextoNaTela));
    } 

}