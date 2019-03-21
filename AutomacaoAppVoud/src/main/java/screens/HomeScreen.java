package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import static app.App.getDriver;


public class HomeScreen {
    
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    MobileElement CadastroLogin;
	
/*	
	@AndroidFindBy(id = "result")
    MobileElement visor;

    @AndroidFindBy(id = "op_add")
    MobileElement soma;

    @AndroidFindBy(id = "eq")
    MobileElement igual;

    @AndroidFindBy(id = "op_mul")
    MobileElement multiplicacao;

    @AndroidFindBy(id = "op_div")
    MobileElement divisao;
   
  */ 

    public HomeScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
    

    //Botão para se cadastrar ou se logar no App
    public MobileElement getCadastroLogin() {
        return CadastroLogin;
    }


/*
    public MobileElement getVisor() {
        return visor;
    }

    public MobileElement getSoma() {
        return soma;
    }


    public MobileElement getIgual() {
        return igual;
    }

    public MobileElement getMultiplicacao() {
        return multiplicacao;
    }


    public MobileElement getDivisao() {
        return divisao;
    }
  */
    

    public void tocaDigito(int valor) {
        String valores = String.valueOf(valor);
        char[] digitoToCharArray = valores.toCharArray();
        for (char digito : digitoToCharArray) {
            getDriver().findElement(By.id("digit_" + digito)).click();
        }
    }


}