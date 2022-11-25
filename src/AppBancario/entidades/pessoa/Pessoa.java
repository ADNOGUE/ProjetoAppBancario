package AppBancario.entidades.pessoa;

import AppBancario.exceptions.ValidacaoException;

import java.math.BigDecimal;

public abstract class Pessoa {

    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) throws ValidacaoException {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public abstract BigDecimal getTaxaSaqueTransf();
    public abstract BigDecimal getTaxaPoupanca();
    public abstract BigDecimal getTaxaInvestimento();

    public void setNome(String nome) throws ValidacaoException {
        if (nome.isBlank()){
            throw new ValidacaoException("Campo Nome é Obrigatório!");
        }
    }

    public void setEndereco(String endereco) throws ValidacaoException {
        if (endereco.isBlank()){
            throw new ValidacaoException("Campo Endereço é Obrigatório!");
        }
    }
}
