package Modelagem;

import java.math.BigDecimal;

public abstract class Pessoa {

    private String nome;
    private String sexo;
    private String endereco;

    public Pessoa(String nome, String sexo, String endereco) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setEndereco(endereco);
      //  return Pessoa;
    }
    public abstract BigDecimal getTaxa();

    public Pessoa(String nome,  String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }

    public void setSexo(String sexo) {
        if (sexo.equals("F") ||
            sexo.equals("M")){
            this.sexo = sexo;
        }
        else {
            System.out.println("Sexo invalido!");
            System.exit(0);
        }

    }

    public void setEndereco(String endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        }
    }
}
