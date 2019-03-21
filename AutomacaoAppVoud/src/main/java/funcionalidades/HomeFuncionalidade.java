package funcionalidades;

import screens.HomeScreen;
import static junit.framework.TestCase.assertTrue;


public class HomeFuncionalidade {

    private HomeScreen home;

    public HomeFuncionalidade(){
        home = new HomeScreen();
    }
    
    public void validarPreencimentoCpf() {
        home.getCadastroLogin().click();
    }

    /*
    public void validarHome() {
        home.getVisor().isEnabled();
    }

    public void somarNumeros(int num1, int num2) {
        home.tocaDigito(num1);
        home.getSoma().click();
        home.tocaDigito(num2);
        home.getIgual().click();

    }

    public void multiplicarNumeros(int num1, int num2) {
        home.tocaDigito(num1);
        home.getMultiplicacao().click();
        home.tocaDigito(num2);
        home.getIgual().click();

    }



    public void validaResultado(int result){
        String resultados = String.valueOf(result);
        String pegarTextoNaTela = home.getVisor().getText();
        assertTrue(resultados.contains(pegarTextoNaTela));

    } 
    */
}
