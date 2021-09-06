package ContaBancaria;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroDaConta, String titular ) {
        this.setTipo("Conta Corrente");
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.setNumeroDaConta(numeroDaConta);
        this.abrirConta();
    }

    @Override
    void abrirConta() {
        System.out.println("Conta de " + this.getTitular() + " foi aberta");
        this.setSaldo(50);
        this.setContaAberta(true);
        this.status();
    }

    @Override
    void pagarMensalidade() {
        this.setSaldo(getSaldo() - 5);
    }
}
