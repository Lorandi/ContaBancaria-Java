package Banco;

public class ContaPoupança extends Conta{

    public ContaPoupança(int agencia, int numeroDaConta, Cliente titular ) {
        this.setTipo("Conta Poupança");
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.setNumeroDaConta(numeroDaConta);
        this.abrirConta();
        this.setMensalidade(10);
    }

}
