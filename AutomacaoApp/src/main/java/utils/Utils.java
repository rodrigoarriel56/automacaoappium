/*
 * Projeto: Automacao Mobile
 * Empresa: 
 * Autor: Rodrigo Arriel
 * Data: 
 * Funcionalidade: Classe de geracao de evidencias dos testes.
 * 
 */

package utils;

import app.App;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class Utils {

    static App app = new App();

    @SuppressWarnings("static-access")
	public void tiraPrint() throws IOException {
        File scrFile = ((TakesScreenshot) app.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot/screenshot.png"));
    }



}
