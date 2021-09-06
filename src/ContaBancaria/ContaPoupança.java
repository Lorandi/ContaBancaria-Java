package ContaBancaria;

public class ContaPoupança extends Conta{

    public ContaPoupança(int agencia, int numeroDaConta, String titular ) {
        this.setTipo("Conta Poupança");
        this.setAgencia(agencia);
        this.setTitular(titular);
        this.setNumeroDaConta(numeroDaConta);
        this.abrirConta();
    }

    @Override
    void abrirConta() {
        System.out.println("Conta de " + this.getTitular() + " foi aberta");
        this.setSaldo(100);
        this.setContaAberta(true);
        this.status();

    }


    @Override
    void pagarMensalidade() {
        this.setSaldo(getSaldo() - 10);
    }
}
