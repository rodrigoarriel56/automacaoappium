/*
 * Projeto: Automa��o do App Voud 
 * Empresa: Autopass
 * Autor: Rodrigo Arriel
 * Data: 18/03/2019
 * Funcionalidade: Classe de execu��o da automa��o
 * 
 */

package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features", tags = "@cadastromidway", glue = "steps"

)

public class TestRunner {

}