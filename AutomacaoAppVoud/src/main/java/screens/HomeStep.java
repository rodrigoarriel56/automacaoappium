/*
 * Projeto: Automação do App Voud 
 * Empresa: Autopass
 * Autor: Rodrigo Arriel
 * Data: 18/03/2019
 * Funcionalidade: Automação de Login do App
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
    
	//Metodo de botão de cadastro ou login
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Botão de cadastro ou login\"]/android.view.ViewGroup")
    MobileElement cadastroLogin;
	
	@AndroidFindBy(xpath = "  ") //Colocar o caminho do campo CPF
    MobileElement preenchimentoCpf;
		
	@AndroidFindBy(xpath = "  ") //Colocar o caminho do botão proccesseguir
    MobileElement acionamentoBotaoProsseguir;
	
	@AndroidFindBy(id = "result") //Validar nome de usuário
    MobileElement visor;
		
	@AndroidFindBy(xpath = "  ")
    MobileElement preencherCampoSenha;
	
	@AndroidFindBy(xpath = "  ")
    MobileElement acionamentoBotaoEntrar;

    public HomeStep() 
    {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Botão para se cadastrar ou se logar no App
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