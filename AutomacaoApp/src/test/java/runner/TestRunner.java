/*
 * Projeto: Automacao do App 
 * Empresa:
 * Autor: Rodrigo Arriel
 * Data:
 * Funcionalidade: Classe de execucao da automacao
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