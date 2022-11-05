package Modelagem;

public class Pessoa {

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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == "f" ||
            sexo == "m"){
            this.sexo = sexo;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        }
    }
}
