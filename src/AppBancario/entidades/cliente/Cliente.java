package AppBancario.entidades.cliente;

import AppBancario.entidades.contas.Contas;
import AppBancario.entidades.pessoa.Pessoa;

public abstract class Cliente <T extends Pessoa, U extends Contas> {

    public void CriarclientePF (U ContaCorrentePf ){
        System.out.println("Teste = " + ContaCorrentePf.getClass());
    }


}
