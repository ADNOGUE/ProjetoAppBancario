package AppBancario.service.validation;

import AppBancario.entidades.pessoa.Pessoa;
import AppBancario.exceptions.ValidacaoException;

public interface ValidarPessoa <T extends Pessoa> {

    void validarDocumento(T Pessoa) throws ValidacaoException;
}
