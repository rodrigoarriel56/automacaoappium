/*
 * Projeto: Automação do App Voud 
 * Empresa: Autopass
 * Autor: Rodrigo Arriel
 * Data: 18/03/2019
 * Funcionalidade: Classe de mapeamento de elementos.
 * 
 */

package hooks;

import cucumber.api.java.After;
import utils.Utils;

import java.io.IOException;

public class Hooks {

   static Utils utils = new Utils();

    @After
    public static void depoisdoCenario() throws IOException {
       utils.tiraPrint();

    }
}
