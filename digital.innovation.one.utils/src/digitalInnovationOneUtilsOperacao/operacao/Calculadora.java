package digitalInnovationOneUtilsOperacao.operacao;

import digitalInnovationOneUtilsOperacao.operacao.internal.DiviHelp;
import digitalInnovationOneUtilsOperacao.operacao.internal.MultHelp;
import digitalInnovationOneUtilsOperacao.operacao.internal.SubHelp;

public class Calculadora {

    private static DiviHelp diviHelp;
    private static MultHelp multHelp;
    private static SubHelp subHelp;
    private static SubHelp sumHelp;



    public Calculadora(){
        diviHelp = new DiviHelp();
        multHelp = new MultHelp();
        subHelp = new SubHelp();
        sumHelp = new SubHelp();

    }

    public int sum(int a, int b){
        return sumHelp.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelp.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelp.execute(a,b);
    }

    public static int divi(int a, int b){
        return diviHelp.execute(a,b);
    }

}
