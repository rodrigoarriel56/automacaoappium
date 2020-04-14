/*
 * Projeto: Automacao 
 * Empresa: 
 * Autor: 
 * Data: 
 * Funcionalidade: Automacao de Login do App
 * 
 */

package pageElemets;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import static app.App.getDriver;
//import org.openqa.selenium.By;

public class PageElements {
    
	//Metodo de botao Entrar na tela iniciar do App
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Entrar']")
    MobileElement btnEntrar;
    
   
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='CPF']") //Colocar o caminho do campo CPF
    MobileElement campoCpf;
	
	 //Continuar inserindo as informacao dos campos do app

    public PageElements() 
    {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Botao iniciarl do App
    public MobileElement getBtnEntrar()
    {
        return btnEntrar;
    }
    
    //Continuar a correção
    
    
    public MobileElement getcampoCpf()
    {
        return campoCpf;
    }
    
   
    
    public void tocaDigito(int valor)
    {
    	String valores = String.valueOf(valor);
        char[] digitoToCharArray = valores.toCharArray();
        for (char digito : digitoToCharArray) {
        getDriver().findElement(By.id("digit_" + digito)).click();
    }
    }
}