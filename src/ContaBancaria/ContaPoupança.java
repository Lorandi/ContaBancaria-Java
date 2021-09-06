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
        this.setSaldo(100);
        this.setStatus(true);
    }

    @Override
    void fecharConta() {
        if(this.isStatus()  && this.getSaldo() == 0){
            this.setStatus(false);
        }else{
            System.out.println("Conta não pode ser fechada");
        }
    }

    @Override
    void pagarMensalidade() {
        this.setSaldo(getSaldo() - 10);
    }
}
