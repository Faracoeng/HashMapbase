package poo;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
                    //Usando constainsKey para buscar elementos
        Map<String,String> example = new HashMap<String,String>();


        /*
         * Vamos adicionar alguns valores a nossa lista
         * */
        example.put( "K1", new String( "V1" ));
        example.put( "K2", new String( "V2" ));
        example.put( "K3", new String( "V3" ));
        example.put( "K4", new String( "V4" ));
        example.put( "K5", new String( "V5" ));

        String keyToSearch = "K1";


        if ( example.containsKey( keyToSearch ) ) {
            System.out.println("Valor da Chave "+keyToSearch+
                    " = "+example.get(keyToSearch));
        }else{
            System.err.println("Chave não existe");
        }

    }
}
