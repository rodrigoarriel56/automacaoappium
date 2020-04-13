/*
 * Projeto: Automacao do App 
 * Empresa: 
 * Autor: Rodrigo Arriel
 * Data: 
 * Funcionalidade: Classe de funcao para tirar print dos testes.
 * 
 */

package utils;

import cucumber.api.java.After;
//import utils.Utils;

import java.io.IOException;

public class screenshot {

   static Utils utils = new Utils();

    @After
    public static void depoisdoCenario() throws IOException {
       utils.tiraPrint();

    }
}
