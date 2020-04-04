/*
 * Projeto: Automacao 
 * Empresa: 
 * Autor: 
 * Data: 
 * Funcionalidade: Automacao de Login do App
 * 
 */

package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import static app.App.getDriver;
//import org.openqa.selenium.By;

public class HomeStep {
    
	//Metodo de bot�o de cadastro ou login
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Bot�o de cadastro ou login\"]/android.view.ViewGroup")
    MobileElement cadastroLogin;
	
	@AndroidFindBy(xpath = "  ") //Colocar o caminho do campo CPF
    MobileElement preenchimentoCpf;
		
	@AndroidFindBy(xpath = "  ") //Colocar o caminho do bot�o proccesseguir
    MobileElement acionamentoBotaoProsseguir;
	
	@AndroidFindBy(id = "result") //Validar nome de usu�rio
    MobileElement visor;
		
	@AndroidFindBy(xpath = "  ")
    MobileElement preencherCampoSenha;
	
	@AndroidFindBy(xpath = "  ")
    MobileElement acionamentoBotaoEntrar;

    public HomeStep() 
    {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Bot�o para se cadastrar ou se logar no App
    public MobileElement getCadastroLogin()
    {
        return cadastroLogin;
    }
    
    public MobileElement getpreenchimentoCpf()
    {
        return preenchimentoCpf;
    }
    
    public MobileElement getBotaoProcesseguir() 
    {
    	return acionamentoBotaoProsseguir; 
    }
    
    public MobileElement getpreencherCampoSenha()
    {
    	return preencherCampoSenha;
    }
    
    public MobileElement getacionamentoBotaoEntrar() 
    {
    	return acionamentoBotaoEntrar;
    	
    }
    
    public MobileElement getVisor()
    {
    	return visor;
    }
    
   /* public void tocaDigito(int valor)
    {
    	String valores = String.valueOf(valor);
        char[] digitoToCharArray = valores.toCharArray();
        for (char digito : digitoToCharArray) {
        getDriver().findElement(By.id("digit_" + digito)).click();
    } */
  }