/*
 * Projeto: Automacao do App 
 * Empresa: 
 * Autor: Rodrigo Arriel
 * Data: 
 * Funcionalidade: Classe de mapeamento de elementos do devices a ser utilizado.
 * 
 */

package app;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

    @SuppressWarnings("rawtypes")
	public static AndroidDriver driver;

    @SuppressWarnings("rawtypes")
	public static AndroidDriver getDriver()
    {
    	if(driver == null){
            conectar();
        }
        return driver;
    }
    
    @SuppressWarnings("rawtypes")
	public static AndroidDriver conectar() {
    	   	
        File diretorioAplicacao = new File("app");
        File arquivoAplicacao = new File(diretorioAplicacao, "/App/app-qa-release.apk");

        DesiredCapabilities capacidade = new DesiredCapabilities();
        capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
        capacidade.setCapability(MobileCapabilityType.NO_RESET, "true");
        capacidade.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 4600);
        
        String uiautomator2 = null;
		capacidade.setCapability(MobileCapabilityType.AUTOMATION_NAME, uiautomator2);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static WebDriverWait esperarpeloDriver(WebDriver driver) 
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait;
    }

}