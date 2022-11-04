package Modelagem;

public class Pessoa {

    private String nome;
    private String sexo;
    private String endereco;

    public Pessoa(String nome, String sexo, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
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
