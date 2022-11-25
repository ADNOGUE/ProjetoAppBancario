package AppBancario.service;

import AppBancario.exceptions.ValoresException;

import java.math.BigDecimal;

public class ContaCorrenteService extends ContaService {

    public void investir(BigDecimal valor) {
        try {
            super.adicionarDinheiro(valor);
        }
        catch (ValoresException e){
            System.out.println(e.getMessage());
        }
    }
}
