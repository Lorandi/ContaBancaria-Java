package Banco;

public class Cliente {
    private String nome;
    private String cpf;
    private boolean platinum;

    public Cliente(String nome, String cpf, boolean platinum) {
        this.nome = nome;
        this.cpf = cpf;
        this.platinum = platinum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isPlatinum() {
        return platinum;
    }

    public void setPlatinum(boolean platinum) {
        this.platinum = platinum;
    }
}
