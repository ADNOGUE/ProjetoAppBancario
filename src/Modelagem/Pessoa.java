package Modelagem;

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
        if (sexo.equals("f") ||
            sexo.equals("m")){
            this.sexo = sexo;
        }
    }

    public void setEndereco(String endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        }
    }
}
