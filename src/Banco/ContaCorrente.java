package Banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroDaConta, Cliente cliente ) {
        this.setTipo("Conta Corrente");
        this.setAgencia(agencia);
        this.setTitular(cliente);
        this.setNumeroDaConta(numeroDaConta);
        this.abrirConta();
        this.setMensalidade(5);
    }
}
