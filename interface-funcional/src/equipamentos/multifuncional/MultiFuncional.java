package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class MultiFuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
   
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }
   
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
    }
}