package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.MultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        MultiFuncional mf = new MultiFuncional();
        
        Impressora impressora = mf;
        Digitalizadora digitalizadora = mf;
        Copiadora copiadora = mf;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        
    }
}