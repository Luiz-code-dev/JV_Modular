package digitalInnovationOneCore;

import digitalInnovationOneUtilsOperacao.operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(Calculadora.divi(15, 3));
    }
}
